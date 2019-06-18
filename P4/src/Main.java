public class Main {
    public static void main(String[] args){
        //三角形测试
        Point a=new Point(1,4);
        Point b=new Point(1,1);
        Point c=new Point(5,1);
        Triangle t= null;
        try {
            t = new Triangle(a,b,c);
            System.out.println(t.toString());
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }


        Point aa=new Point(1,3);
        Point bb=new Point(1,1);
        Point cc=new Point(1,10);
        try{
            Triangle tt=new Triangle(aa,bb,cc);
            System.out.println(tt.toString());
        }
        catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
