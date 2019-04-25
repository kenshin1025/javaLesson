import java.util.Scanner;

public class ScoresToSort {
    public static void main(String[] args) {
        String[] names = {"佐藤一郎", "鈴木次郎", "高橋三郎", "田中四郎", "伊藤五郎", "渡辺六郎", "山本七子", "中村八郎", "小林九", "加藤十子"};
        int[][] scores = {
            {100,30,50,40,50,60,70,80,95,10},
            {30,55,45,60,65,50,80,25,100,35},
            {90,75,35,90,65,60,80,25,0,20},
            {10,85,25,70,90,80,60,50,40,30},
            {60,40,30,50,70,70,70,70,15,55},
        };

        //５教科の合計点を生徒ごとに出し、大きい順に並び替え
        //並び替えた点数を名前と一緒に表示します

        //①5教科の生徒ごとの合計点を出す
        // 生徒の合計点をまとめる配列を別途作成する
        int[] totalScores = new int[names.length];

        // 生徒のループを作成して、５教科を加算した結果を合計点の配列に生徒番号を合わせ格納
        for(int i=0; i<names.length; i++){
            totalScores[i] = scores[0][i] + scores[1][i] + scores[2][i] + scores[3][i] + scores[4][i];
        }
        // 合計点の配列を大きい順に並び替え
        // 名前も一緒に
  
        for (int s = 0; s < totalScores.length - 1; s++) { 
            for (int t = s + 1; t < totalScores.length; t++) { 
            if (totalScores[s] < totalScores[t]) {
                //降順で並び替えるため、比較元より比較先が大きければ以下の入れ替え処理を行う
                int tmp = totalScores[t];
                totalScores[t] = totalScores[s];
                totalScores[s] = tmp;

                String ctmp = names[t];
                names[t] = names[s];
                names[s] = ctmp;
            }
            }
        }

        for(int i=0; i<names.length; i++){
            System.out.println(names[i] + ":" + totalScores[i]);
        }
    }
}