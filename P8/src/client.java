import java.io.*;
import java.net.Socket;
//实验8.2客户端
public class client{
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",5888);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        DataInputStream dis = new DataInputStream(in);
        DataOutputStream dos = new DataOutputStream(out);
        dos.writeDouble(12.3);
        Double s;
        if((s=dis.readDouble())!=null){
            System.out.println("面积为："+s);
        }
        dos.close();
        dis.close();
        socket.close();
    }

}
