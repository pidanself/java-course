public class RegularPolygon {
    private int n=3;//边数
    private double side=1;//边长
    private double x=0;
    private double y=0;
    private double pi=Math.toRadians(180);
    //所有数据域的访问器和修改器
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    RegularPolygon(){
    }
    RegularPolygon(int nd,double sided){
        n=nd;
        side=sided;
    }
    RegularPolygon(int nd,double sided,double xd,double yd){
        n=nd;
        side=sided;
        x=xd;
        y=yd;
    }

    //一个返回多边形周长的方法getPerimeter()；
    public double getPerimeter(){
        return n*side;
    }

    //返回多边形面积
    public double getArea(){
        return n*Math.pow(side,2)/(4*Math.tan(pi/n));
    }
}
