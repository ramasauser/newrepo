package localrepo;
import java.util.*;
public class function3 {
    public static void sonuTogether(CharSequence delimiter,Iterable<? extends CharSequence> elements){
                // public static String join(CharSequence delimiter,
                  //Iterable<? extends CharSequence> elements)
                //Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
               //For example,

              //List<String> strings = List.of("Java", "is", "cool");
              //String message = String.join(" ", strings);
              // message returned is: "Java is cool"
            
              List<String> strings = List.of("sonu", "loves", "ram","who","already","is","sonu","so","sonu","loves","sonu","no","sence");
              String message = String.join("-", strings);
              System.out.println(message);
    }

    public static void main(String[] args) {
        
        sonuTogether(null, null);
        System.out.println("conclusion:ram loves sonu");
    }
    
}
