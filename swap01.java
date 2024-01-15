package localrepo;

public class swap01 {
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.err.println("a in swap: "+a);
        System.out.println("b in swap: "+b);

    }
    public static void main(String[] args) {
        int c=5;
        int d=10;

        //swap
       swap(c, d);
        System.err.println("a in main : "+c);
        System.out.println("b in main: "+d);

    }
}
