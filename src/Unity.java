import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Unity {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("unity.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (sc.nextLine().equals("Maxwell: Regarding the Unity update...")) flag = false;
        }

        if (flag) System.out.println("Song passed! Everyone gets an A for Christmas.");
        else System.out.println("Song failed. Everyone gets an F in their stocking.");
    }
}
