package localrepo;
import java.util.*;
public class continue2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       
        do{ System.out.println("enter value of n :");
             int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);

        }while(true);
    }
    
}
