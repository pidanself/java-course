public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    private double a,b,c;
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
    public double dis(Point a,Point b){
        return Math.pow(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2),0.5);
    }

    public Triangle(Point p1, Point p2, Point p3) throws IllegalTriangleException{
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.a=dis(p1,p2);
        this.b=dis(p1,p3);
        this.c=dis(p2,p3);
        if(a+b<=c||a+c<=b||b+c<=a){
            throw new IllegalTriangleException("输入边无法构造为三角形");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p1:" + p1.toString() +
                ", p2:" + p2.toString() +
                ", p3:" + p3.toString() +
                ",面积："+this.getArea()+
                ",周长："+this.getPerimeter()+
                '}';
    }

    public double getArea(){
        double p=getPerimeter()/2;
        Double s=Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
        return s;
    }

    public double getPerimeter(){
        return a+b+c;
    }
}
