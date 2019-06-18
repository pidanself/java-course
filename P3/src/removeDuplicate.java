import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class removeDuplicate {
    static public void removeDuplicate(ArrayList<Integer> list){
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<list.size();i++){
            int t=list.get(i);
            if(s.contains(t)){
                list.remove(i);
                i=i-1;
            }
            else {
                s.add(t);
            }
        }
    }
}
