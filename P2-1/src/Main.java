
public class Main {

    public static void main(String[] args) {
//       RegularPolygon test=new RegularPolygon(4,3,0,0);
//       double out=test.getArea();
//       System.out.printf("Area:%.2f\n",out);
//       System.out.printf("Perimeter: %.2f\n",test.getPerimeter());
        Queue q=new Queue();
        System.out.println(q.getSize());
        q.enqueue(3);
        System.out.println(q.dequeue());
    }
}
