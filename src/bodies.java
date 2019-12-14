import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class bodies {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("p1.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(sc.nextLine());
        }
    }
}
