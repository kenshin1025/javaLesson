import java.util.Scanner;

public class Saiten {
    public static void main(String[] args) {
        System.out.println("テストの点数を入力してください。");
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        int num = Integer.parseInt(inputLine);
        if(num < 0 || num > 100){
            System.out.println("入力された値は点数として正しくありません。");
            return;
        }
        else if(num >= 60){
            System.out.println("合格です。おめでとう！");
            return;
        }
        else if(num >= 20){
            System.out.println("不合格です。再テストを行いましょう！");
            return;
        }
        else{
            System.out.println("不合格です。来年もう一年頑張りましょう。");
            return;
        }
    }
}