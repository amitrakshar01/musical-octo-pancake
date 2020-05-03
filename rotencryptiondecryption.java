import java.util.*;
public class encryptiondecryption{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rot value:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the word:");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int a=(int)c;
            if(a>=65 && a<77){
                a+=n;
            }
            else if(a>=97 && a<109){
                a+=n;
            }
            else if(a>77 && a<=90){
                a-=n;
            }
            else if(a>109 && a<=122){
                a-=n;
            }
            System.out.print((char)a);
        }
        System.out.println();
    }
}