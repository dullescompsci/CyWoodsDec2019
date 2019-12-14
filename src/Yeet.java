import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Yeet {
    public static String cleanZero(String yeet) {
        String result = "";
        int i = 0;
        for (i = 0; i < yeet.length(); i++) {
            if (yeet.charAt(i) != '0') break;
        }
        return yeet.substring(i);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("yeet.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line);
            String x = st.nextToken(), y = st.nextToken();
            BigInteger a = new BigInteger(x);
            int yInt = Integer.parseInt(y);
            BigInteger z = a.pow(yInt);
            String yeet = y + x;
            if (z.toString().equals(yeet)) System.out.println(cleanZero(yeet) + " Yeet");
            else {
                System.out.println(cleanZero(yeet) + " Get Yate");
            }


        }
    }
}
