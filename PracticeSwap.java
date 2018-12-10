public class PracticeSwap {
    public static void main(String[] args) {
        String x= "Framework";
        String y= "Automation";

        System.out.println("before swapping");
        System.out.println("value of x: "+x);
        System.out.println("value of y; "+y);

                x = x+y;// FrameworkAutomation
                y = x.substring(0,x.length()-y.length());//FrameworkAutomation-Automation=Framework

                x = x.substring(y.length());//Automation


        System.out.println("after swapping");
        System.out.println(x);
        System.out.println(y);




    }
}
