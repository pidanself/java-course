public class Main {

    public static void main(String[] args) throws IllegalTriangleException {
//        Gun g=new Gun();
//        //装弹7次
//        for(int i=0;i<7;i++){
//            try{
//                g.load();
//            }
//            catch (ClipError e){
//                e.printStackTrace();
//            }
//        }
//
//        //射击8次
//        for(int i=0;i<8;i++){
//            try{
//                g.shoot();
//            }
//            catch (ClipError e){
//                e.printStackTrace();
//            }
//        }

        //三角形测试
        Point a=new Point(1,4);
        Point b=new Point(1,1);
        Point c=new Point(5,1);
        Triangle t=new Triangle(a,b,c);
        System.out.println(t.toString());

    }
}
