public class ABC17 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,12,24,100};
        int []b={3,6,24};
        int []c=new int[100];
        //时间复杂度为n,设两个指针i,j分别指向数组a,b;
        int i=0,j=0;
        int index=0;
        while((i<=a.length-1)){
            if(j>=b.length){
                c[index++]=a[i];
                i++;
            }
            else if(a[i]<b[j]){
                c[index++]=a[i];
                i++;
            }
            else if(a[i]==b[j]){
                i++;
                j++;
            }

        }
        for(i=0;i<index;i++){
            System.out.println(c[i]);
        }
    }
}
