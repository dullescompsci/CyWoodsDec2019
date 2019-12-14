import java.io.*;
import java.util.*;

public class Written {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> scores = new HashSet<>();
        for (int i = 0; i <= 40; i++) { //skipped
            for (int j = 0; j <= 40 - i; j++) { //correct
                int k = 40 - i - j;
                scores.add(6 * j - 2 * k);
            }
        }
        Scanner sc = new Scanner(new File("written.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(sc.nextLine());
            if (scores.contains(score)) System.out.println("Possible");
            else System.out.println("Impossible");
        }
    }
}
