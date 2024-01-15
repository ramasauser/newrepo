package localrepo;

public class binomial {
    public static int factorial(int n){
        
        int f=1;
        for(int i=1;i<=n;i++){
             f=f*i;
        }
        return f;
    }
    public static int bion(int m,int r){
        int mf=factorial(m);
        System.out.println(mf);
        int rg=factorial(r);
        System.out.println(rg);
        int m_r=factorial(m-r);
        System.out.println(m_r);
        int result=mf/(rg*m_r);
        return result;
        
    }
    public static void main(String[] args) {
        int result=bion(5, 02);
        System.out.println(result);

        
    }
    
}
