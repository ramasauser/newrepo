package localrepo;

public class overloading1 {
    public static int sum(int a,int b) {
        return a+b;

        
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
        
        
    }
    public static float sum(float a,float b) {
        return a+b;        // because in functio overloading,only number of parameters can be changed
   // or parameters type can be changed return type if changed while calling function we use return type like f for float be same        
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(5, 7, 3));
        System.out.println(sum(5.9f, 5.1f));
        
        
    }
    
}
