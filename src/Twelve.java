import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("twelve.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("The next gift is " + sc.nextLine() + ".");
        }
    }
}
