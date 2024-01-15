package localrepo;

public class decimal_to_binary {
    public static void decToBin( int decNum) {
        int binNum=0;
        int pow=0;
        int myNum=decNum;

        while(decNum>0){
            int rem=decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;

        }
        System.out.print("decimal value :"+myNum+" has binary value:"+binNum);

    }
    public static void main(String[] args) {
        decToBin(7);
        
    }
    
}
