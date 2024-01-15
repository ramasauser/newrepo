package localrepo;

public class function5 {
    public static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }
    public static void main(String[] args) {
        int n=5;
        int result=factorial(n);
        System.out.println(result);
        System.out.println(factorial(7));
        
    }
    
}
