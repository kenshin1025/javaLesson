import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("任意の整数を入力してください");
        
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        int num = Integer.parseInt(inputLine);

        if(num <= 1){
            System.out.println("素数ではありません");
        }
        else{
            for(int i=2; i<num; i++){
                if(num%i == 0){
                    System.out.println("素数ではありません");
                    return;
                }
            }
            System.out.println("素数です");
        }
    }
}