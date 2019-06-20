import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientO {

    public void coo(String name,String ids,String sexs,String gls,String majors,String addresss ) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("localhost",5889);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        OutputStream out = null;
        try {
            out = socket.getOutputStream();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ObjectOutputStream dos = null;
        try {
            dos = new ObjectOutputStream(out);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Student s= new Student();
        s.setName(name);
        s.setId(ids);
        s.setGrade(gls);
        s.setMajor(majors);
        s.setSex(sexs);
        s.setAddress(addresss);

        dos.writeObject(s);
        dos.close();
        socket.close();
    }
}
