import java.util.Scanner;
public class PalindromeSwitchCase {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        System.out.println("enter a string:");
        String val=a.nextLine();
        String rev="";
        for( int i=val.length()-1;i>=0;i--){
            rev=rev+val.charAt(i);

        }
        if(rev==val){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}