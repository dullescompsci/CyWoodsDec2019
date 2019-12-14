import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Naughty {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("naughty.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            sc.nextLine();
            char[] check = sc.nextLine().toCharArray();

            int maxScore = 0;
            String maxWord = "";
            double trueMax = 0;

            for (int j = 1; j < m; j++) {
                String w = sc.nextLine();
                char[] word = w.toCharArray();
                int score = 0;
                for (int k = 0; k < word.length; k++) {
                    if (word[k] == check[k]) score++;
                }
                if (score > maxScore) {

                    maxScore = score;
                    maxWord = w;
                }
            }

            trueMax = ((double) maxScore)/check.length;
            trueMax *= 100;
            int truemax = (int) Math.round(trueMax);
            if (maxScore == 0) System.out.println("FAILED\nAccuracy Percentage: NaN\n");
            else {
                System.out.println(maxWord);
                System.out.println("Accuracy Percentage: " + truemax + "%");
                System.out.println();
            }
        }
    }
}
