package localrepo;

public class prime3 {
    //for n>2
    public static boolean isPrime(int n) {
        //corner case 2
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(10));
        
    }
    
}
