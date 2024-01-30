public class minmax {
    public static void main(String[] args){
        int a[]={10,11,13,14,15,17,20,25};
        int min=a[0];
        int max=a[0];
        for(int i=1;i<a.length; i++){
            if(a[i]<min){
                min=a[i];}
            if(a[i]>max){
                max=a[i];}
        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);


    }
}