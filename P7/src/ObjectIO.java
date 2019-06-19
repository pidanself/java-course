import java.io.*;
import java.util.Random;
public class ObjectIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student[] ss = new Student[5];
        for(int i=0;i<5;i++){
            ss[i]=new Student();
            int rad;
            ss[i].setName("myname");
            Random rand = new Random();
            rad = rand.nextInt(1000);
            ss[i].setId(rad);
            rad=rand.nextInt(100);
            ss[i].setScore(rad);
        }
        File f=new File("exercise3.dat");
        if(!f.exists()){
            f.createNewFile();
        }
        FileOutputStream fos=new FileOutputStream(f,true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(int i=0;i<5;i++){
            oos.writeObject(ss[i]);
            oos.flush();
        }
        oos.close();
        fos.close();
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student tReaded = null;
        try{
            while(true){
                tReaded=(Student)ois.readObject();
                System.out.println(tReaded.toString());
            }
        }catch (EOFException e){
            System.out.println("结束");
            ois.close();
            fis.close();
        }

    }
}
