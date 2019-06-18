import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int id;
    private String Type;
    private int nums;
    private List<Ball> clip = new ArrayList();
    static int ID=1;
    public Gun() {
        id=1;
        Type="M54";
        nums=6;
    }

    public Gun(int id, String type, int nums) {
        this.id = id;
        Type = type;
        this.nums = nums;
    }
    //装弹
    public void load() throws ClipError{
        if(clip.size()>=nums){
            throw new ClipError("弹夹已满，无法继续装弹！");
        }
        else{
            clip.add(new Ball(ID++,Type));
        }
    }
    //射击
    public Ball shoot() throws ClipError{
        if(clip.size()==0){
            throw new ClipError("弹夹空，无法再射！");
        }
        else {
            Ball ans=clip.get(clip.size()-1);
            clip.remove(clip.size()-1);
            ID--;
            return ans;
        }
    }
    //显示所有弹夹的信息
    public void showBalls(){
        if(clip.isEmpty()){
            System.out.println("弹夹为空");
        }
        else {
            for(int i=0;i<clip.size();i++){
                System.out.println(clip.get(i).toString());
            }
        }
    }


    //取得子弹数
    private int getBallNums(){
        return clip.size();
    }
}
