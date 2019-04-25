import java.util.Scanner;

public class AtodashiJanken {
    public static void main(String[] args) {
        // 変数には、0から3未満のint型の整数値がランダムで格納されます。
        int com = new java.util.Random().nextInt(3);
        String ComHand = "グー";

        switch (com) {
            case 0:
                ComHand = "グー";
                break;
            
            case 1:
                ComHand = "チョキ";
                break;

            case 2:
                ComHand = "パー";
                break;
        
            default:
                break;
        }

        System.out.println("コンピューターは" + ComHand + "を出しました");

        System.out.println("何を出しますか？ (0:グー,1:チョキ,2:パー)");
        
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        int prayer = Integer.parseInt(inputLine);

        if(prayer < 0 || prayer > 2){
            System.out.println("あなたの出した手が判断できません。勝負はしません。");
        }
        else if(com == prayer){
            System.out.println("あいこです");
        }
        else if((com == 0 && prayer == 2) || com == prayer+1){
            System.out.println("あなたの勝ちです!");
        }
        else{
            System.out.println("あなたの負けです…");
        }
    }
}