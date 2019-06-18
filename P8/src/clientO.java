import java.io.*;
import java.net.Socket;
//实验8.3客户端
public class clientO {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",5889);

        OutputStream out = socket.getOutputStream();
        ObjectOutputStream dos = new ObjectOutputStream(out);
        Student s=new Student();
        s.setName("皮蛋");
        s.setId(41601435);
        s.setMajor("计算机");
        s.setSex(true);
        s.setAddress("北科");

        dos.writeObject(s);
        dos.close();
        socket.close();
    }
}
