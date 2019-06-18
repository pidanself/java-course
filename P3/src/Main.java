import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Person p=new Person("pidan","ustb","1565278","pi@163");
//        MyDate d=new MyDate(new Date());
//        Staff s=new Staff("pidan","ustb","1565278","pi@163","723",123456,d,"professor");
//        System.out.println(p.toString());
//        System.out.println(s.toString());
        ArrayList<Integer> l=new ArrayList<>();
        l.add(3);
        l.add(3);
        l.add(5);
        l.add(3);
        l.add(9);
        l.add(9);
        l.add(6);
        l.add(30);
        l.add(30);
        removeDuplicate.removeDuplicate(l);
        System.out.println(l);
    }
}
