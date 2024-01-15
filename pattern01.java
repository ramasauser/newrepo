package localrepo;

public class pattern01 {
    public static void hollowRectangle(int totalRows,int totalColumns) {
        for(int i=1;i<=totalRows;i++){
            for(int j=1;j<=totalColumns;j++){
                if(i==1||i==totalRows||j==1||j==totalColumns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hollowRectangle(4, 5);
        
    }
    
}
