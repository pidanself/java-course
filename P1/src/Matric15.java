import java.util.Scanner;

public class Matric15 {
    void multi(int a[][],int b[][],int i1,int j1,int i2,int j2){
        int ans[][]=new int[100][100];
        if(j1!=i2) System.out.println("矩阵无法相乘");
        else{
            for(int i=0;i<i1;i++){
                for(int j=0;j<j2;j++){
                    int t=0;
                    for(int k=0;k<j1;k++){
                        t=t+a[i][k]*b[k][j];
                    }
                    ans[i][j]=t;
                    System.out.print(t+",");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        int [][]a=new int[100][100];
        int [][]b=new int[100][100];
        System.out.println("请输入，第一行输入两个数字为二维矩阵A的行列数，第二行输入两个数字为二维矩阵B的行列数");
        Scanner input=new Scanner(System.in);
        int i1,j1,i2,j2;
        i1=input.nextInt(); j1=input.nextInt(); i2=input.nextInt(); j2=input.nextInt();
        System.out.println("请输入A矩阵：");
        for(int i=0;i<i1;i++){
            for(int j=0;j<j1;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("请输入B矩阵：");
        for(int i=0;i<i2;i++){
            for(int j=0;j<j2;j++){
                b[i][j]=input.nextInt();
            }
        }
        int [][]ans=new int[100][100];
        Matric15 m=new Matric15();
        m.multi(a,b,i1,j1,i2,j2);
    }
}
