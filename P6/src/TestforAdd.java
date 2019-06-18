public class TestforAdd {
    public static void main(String[] args){
        matrixA a=new matrixA();
        //构造2个2000*2000的矩阵
        int[][] b=new int[8000][8000];
        for (int i=0;i<8000;i++){
            for(int j=0;j<8000;j++){
                b[i][j]=i;
            }
        }
        long startTime = System.currentTimeMillis();    //获取开始时间
        a.addp(b,b);
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("并行计算时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();    //获取开始时间
        a.add(b,b);
        endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("顺序计算时间：" + (endTime - startTime) + "ms");
    }
}
