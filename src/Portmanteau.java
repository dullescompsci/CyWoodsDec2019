import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Portmanteau {
    public static boolean port(String one, String two, String combine) {
        for (int i = 0; i <= one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {
                String poof = one.substring(0, i) + two.substring(j);
                String p = two.substring(j) + one.substring(0, i);
                //System.out.println(poof);
                //System.out.println(p);
                //System.out.println();
                if (poof.equals(combine) || p.equals(combine)) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("portmanteau.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String a = sc.next(), b = sc.next(), c = sc.next();
            if (sc.hasNextLine()) sc.nextLine();
            if (port(b, c, a) || port(c, b, a)) System.out.println("YES");
            else System.out.println("NO");
            //System.out.println(a + " " + b + " " + c);
        }
    }
}
