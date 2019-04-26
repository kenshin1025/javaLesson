import java.util.Scanner;

public class UtilityMethods {
    public static void main(String[] args) {
        UtilityMethods app = new UtilityMethods();
        app.printCurrency(1);
        app.printCurrency(1.1);
        app.printCurrency(0);
        app.printCurrency(-1);
        app.printCurrency(1.155);
        app.printCurrency(100);

        System.out.println(app.add(1, 2));
        System.out.println(app.add(-1, 2));
        System.out.println(app.add(0, 0));
        System.out.println(app.add(999999999, 1));


        System.out.println(division(2, 2));
        System.out.println(division(0, 2));
        System.out.println(division(2, 0));
        System.out.println(division(2, 1));
        System.out.println(division(2, 400));

        System.out.println(app.getTheAnswerToTheUltimateQuestionOfLife_TheUniverse_And_Everything());
    }
    static void printCurrency(double num){
        System.out.printf("%.2f\n", num);
    }
    static int add(int a, int b){
        int ans = a+b;
        return ans;
    }
    static double division(int a, int b){
        double x = a;
        double y = b;
        return x/y;
    }
    static String getTheAnswerToTheUltimateQuestionOfLife_TheUniverse_And_Everything(){
        try{
            Thread.sleep(750);
        }catch(InterruptedException e){}
        return "42";
    }
}