package localrepo;
import java.util.*;
public class function2 {
    public static int calculatesum(int a,int b){
        int sum = a+b;

        return sum;
    }
    public static String sonu(String c,String d){
        String together=c+d;
        return together;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int sum= calculatesum(a, b);
        System.out.println("the sum is:"+sum);
        String c=sc.nextLine();
        String d=sc.nextLine();


        String together=sonu(c,d);
        System.out.println(together);
        



    }
    
}
