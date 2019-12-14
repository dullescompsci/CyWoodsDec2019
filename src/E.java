import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class E {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("e.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
            double average = (a + b + c)/3;
            double minus = average - d;
            minus /= d;
            minus *= 100;
            System.out.printf("%.2f", Math.abs(minus));
            System.out.println("%");
        }
    }
}
