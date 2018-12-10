import java.sql.SQLOutput;

public class practice2 {
    public static void main(String[] args) {

   String L ="Lobid";
   String S ="Saymon";

        System.out.println("Before swapping");
        System.out.println(L);
        System.out.println(S);
        L= L+S;
        S= L.substring(0,L.length()-S.length());

        L= L.substring(S.length());

        System.out.println("After swapping");
        System.out.println(L);
        System.out.println(S);








    }




}
