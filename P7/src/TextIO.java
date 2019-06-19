import java.io.*;
import java.util.Random;

public class TextIO {
    FileReader fis=null;
    BufferedReader bis=null;

    FileWriter fos=null;
    BufferedWriter bos=null;

    public void OUT() throws IOException {
        File f=new File("exercise.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        fos=new FileWriter(f,true);
        bos=new BufferedWriter(fos);
        int rad;
        for(int i=0;i<100;i++){
            Random rand = new Random();
            rad = rand.nextInt();
            bos.write(rad);
            bos.write(" ");
        }
        bos.close();
        fos.close();
    }

    public void IN() throws IOException{
        fis=new FileReader("exercise.txt");
        bis=new BufferedReader(fis);

        int t;
        while((t=bis.read())!=-1){
            System.out.println(t);
        }
        bis.close();
        fis.close();
    }
    public static void main(String[] args) throws IOException {
        TextIO test=new TextIO();
        test.OUT();
        test.IN();
    }
}
