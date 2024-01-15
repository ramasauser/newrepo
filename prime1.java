package localrepo;
import java.util.*;
public class prime1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        int n=sc.nextInt();
        if(n==2){
            System.out.println(" it is a prime");

        }
     else{
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                 isprime=false;
            }

        }
        if(isprime==true){
        System.out.println("number "+n+" is a prime ");
        }
        else{
            System.out.println("number "+n+" is not a prime ");
        }
      }
    }
    
}
