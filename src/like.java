import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class like {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("like.dat"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            input = input.replaceAll("like ", "");
            input = input.replaceAll("um ", "");
            input = input.replaceAll("uh ", "");
        }
    }
}
