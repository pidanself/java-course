import java.io.*;
import java.util.Random;

public class BinaryIO {
    FileOutputStream fos=null;
    BufferedOutputStream bos=null;
    DataOutputStream dos=null;

    FileInputStream fis=null;
    BufferedInputStream bis=null;
    DataInputStream dis=null;

    public void OUT() throws IOException {
            File f=new File("exercise2.dat");
            //若不存在则创建
            if(!f.exists()){
                f.createNewFile();
            }
            fos = new FileOutputStream(f,true);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            int rad;
            for(int i=0;i<100;i++){
                Random rand = new Random();
                rad = rand.nextInt();
                dos.writeInt(rad);
            }
            dos.close();
            bos.close();
            fos.close();
    }

    public void IN() throws IOException {
        fis=new FileInputStream("exercise2.dat");
        bis=new BufferedInputStream(fis);
        dis=new DataInputStream(bis);
        int i=0;
        while((i=dis.read())!=-1){
            System.out.println(i);
        }
        fis.close();
        bis.close();
        dis.close();
    }
    public static void main(String[] args) throws IOException {
        BinaryIO test=new BinaryIO();
        test.OUT();
        test.IN();
    }
}
