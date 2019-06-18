public class Bubble13 {

    //冒泡排序
    void bubble(int a[],int s,int e){
        for(int i=s;i<e;i++){
            for(int j=s;j<e-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }

    }

    //二分查找,返回查找元素在数组中的位置。 -1代表无法查找
    int find(int a[],int t){
        if(a[0]>t||a[a.length-1]<t){
            return -1;
        }
        int left=0,right=a.length-1;
        int mid=(left+right)/2;
        while (left<right){
            if(a[mid]==t){
                return mid;
            }
            else if(a[mid]>t){
                right=mid-1;
                mid=(left+right)/2;
            }
            else{
                left=mid+1;
                mid=(left+right)/2;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] a={1,5,2,9,14,23,4,3,2,5,2};
        Bubble13 b=new Bubble13();
        //sort
        b.bubble(a,0,a.length-1);
        //out
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        //find&out
        System.out.println("\n14的位置为："+b.find(a,14));

    }
}
