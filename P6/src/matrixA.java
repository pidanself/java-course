import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class matrixA{
    //顺序方法实现
    public int[][] add(int[][] a,int[][] b){
        int[][] ans=new int[8000][8000];
        for(int i=0;i<8000;i++){
            for(int j=0;j<8000;j++){
                ans[i][j]=a[i][j]+b[i][j];
            }
        }
        return ans;
    }

    //并行方法
    public int[][] addp(int[][] a,int[][] b){

        ExecutorService es=Executors.newCachedThreadPool();
        for(int i=0;i<8000;i++){
           es.execute(new addpp(i,a,b));
        }
        es.shutdown();
        return a;
    }

    public class addpp implements Runnable{
        int i;
        int[][] a;
        int[][] b;
        addpp(int i,int[][] a,int[][] b){
            this.i=i;
            this.a=a;
            this.b=b;
        }
        @Override
        public void run() {
            for(int k=0;k<8000;k++){
                a[i][k]=a[i][k]+b[i][k];
            }
        }

    }

}







