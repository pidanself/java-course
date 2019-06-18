import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main implements Runnable{
    sumt s=new sumt();
    sumtn ss=new sumtn();
    int i;
    public static void main(String[] args) {
        //线程池
        ExecutorService es= Executors.newFixedThreadPool(1000);
        Main t=new Main();
        for(int i=0;i<1000;i++){

            es.execute(t);
        }
        es.shutdown();
    }

    @Override
    public void run() {
        //同步
        s.add();
        //不同步
//        ss.add();
    }
}
//同步
class sumt{
    private static int sum=0;
    public synchronized void add(){
        sum++;
        try { Thread.sleep(10);
        }catch(InterruptedException e){e.printStackTrace();}
        System.out.println(sum);

    }
}

//不同步
class sumtn{
    private static int sum=0;
    public void add(){
        sum++;
        try { Thread.sleep(10);
        }catch(InterruptedException e){e.printStackTrace();}
        System.out.println(sum);
    }
}