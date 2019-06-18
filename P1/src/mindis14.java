import java.util.Scanner;

public class mindis14 {
    public static void main(String[] args) {
        Point p[]=new Point[100];
        System.out.println("请输入空间点个数:");
        int num=0;
        //输入声明
        Scanner input=new Scanner(System.in);
        num=input.nextInt();

        System.out.println("请输入点的坐标(x,y,z)，每行一个点");
        for(int i=0;i<num;i++){
            int x,y,z;
            x=input.nextInt();
            y=input.nextInt();
            z=input.nextInt();
            Point t=new Point(x,y,z);
            p[i]=t;
        }
        Point ans[]=new Point[2];
        int sh=1000000000;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                int a,b,c;
                a= (int) (Math.pow((p[i].x-p[j].x),2));
                b=(int) (Math.pow(p[i].y-p[j].y,2));
                c=(int) (Math.pow(p[i].z-p[j].z,2));
                if(sh>a+b+c){
                    ans[0]=p[i];
                    ans[1]=p[j];
                    sh=a+b+c;
                }
            }
        }
        System.out.println("距离最近的两个点为的坐标分别为：");
        System.out.println(ans[0].x+","+ans[0].y+","+ans[0].z);
        System.out.println(ans[1].x+","+ans[1].y+","+ans[1].z);
    }
}
