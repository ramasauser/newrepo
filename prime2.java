package localrepo;

public class prime2 {
    public static boolean isPrime(int n) {
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;//because even if we find any 1 number that can completely divide n then n is not a prime
            }
        
        }
      return isPrime;   
    }
    public static void main(String[] args) {
        System.out.println(isPrime(44));
        
    }
    
}
