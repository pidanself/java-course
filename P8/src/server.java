import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
//实验8.2服务端
import java.net.*; import java.io.*;
public class server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5888);
        while (true){
            Socket socket = ss.accept();
            Thread runner = new Thread(new Runner(socket));
            runner.start();
        }
    }
}


class Runner implements Runnable{
    Socket socket;
    public Runner(Socket socket) { this.socket = socket; }
    public void run() {
        try {
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(in);
            DataOutputStream dos = new DataOutputStream(out);
            Double s;
            if((s=dis.readDouble())!=null) {
                System.out.println("半径大小为："+s);
                System.out.println("from: "+socket.getInetAddress());
                System.out.println("port: "+socket.getPort());
            }
            dos.writeDouble(Math.PI*Math.pow(s,2));
            dis.close();
            dos.close();
            socket.close();
        } catch (IOException e) { e.printStackTrace(); }
    }
}