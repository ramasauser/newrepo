package localrepo;

public class binary_to_decimal {
    public static int binToDec( int binNum) {
        int myNum=binNum;
        int dec=0;
        int pow=0;
        while(binNum>0){
            int lastdig=binNum%10;
            dec=dec+(lastdig*(int)(Math.pow(2,pow)));
            pow++;
            binNum=binNum/10;


        }
        System.out.println("the binary number: "+myNum+" is : "+dec+" in decimal");

        return dec;
        
    }
    public static void main(String[] args) {
        binToDec(10001);
        
    }
    
}
