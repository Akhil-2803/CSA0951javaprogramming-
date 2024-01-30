public class minMax {
    public static void main(String[] args){
        int a[]={5,44,23,77,89,43,56,2};
        int min=a[0],sum=0,diff=0;
        int max=a[0];

        for(int i=1;i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
            for(i=0;i<a.length;i++){
                sum=sum+a[i];
                diff=a[i]-diff;
            }
        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);
        System.out.println("sum:"+sum+" difference:"+diff);

    }
}