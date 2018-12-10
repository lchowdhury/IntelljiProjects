public class SwapString {
    public static void main(String[] args) {
        String a = "Selinium";
        String b = "java";
        System.out.println("Before swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of a : "+b);
         //append a and b
        a= a+b;// selinium java
        //store initial String a in string b
        b = a.substring(0, a.length()-b.length());

         // store initial String b in String a
        a = a.substring(b.length());

        System.out.println("After swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of a : "+b);






    }




}
