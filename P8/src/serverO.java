import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.net.*; import java.io.*;
public class serverO {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5889);

        while (true){
            Socket socket = ss.accept();
            Thread runner = new Thread(new Runners(socket));
            runner.start();
        }
    }
}

class Runners implements Runnable{
    Socket socket;
    public Runners(Socket socket) { this.socket = socket; }
    public void run() {
        try {
            InputStream in = socket.getInputStream();
            ObjectInputStream dis = new ObjectInputStream(in);
            Student s=(Student)dis.readObject();
            ServerWindow sw = new ServerWindow(s.getName(), s.getId(), s.getSex(), s.getGrade(), s.getMajor(), s.getAddress());
            System.out.println(s.getName());
            dis.close();
            socket.close();
        } catch (IOException e) { e.printStackTrace(); } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}