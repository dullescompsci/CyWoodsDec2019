import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("CERO", 0);
        map.put("UNO", 1);
        map.put("DOS", 2);
        map.put("TRES", 3);
        map.put("CUATRO", 4);
        map.put("CINCO", 5);
        map.put("SEIS", 6);
        map.put("SIETE", 7);
        map.put("NUEVE", 9);
        map.put("DIEZ", 10);
        Scanner sc = new Scanner(new File("ocho.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String a = sc.next(), b = sc.next();
            if (a.equals("OCHO")) {
                if (b.equals("OCHO")) System.out.println("8 = 8");
                else System.out.println("8 > " + map.get(b));
            }
            else if (b.equals("OCHO")) {
                System.out.println(map.get(a) + " < 8");
            }

            else {
                if (map.get(a) > map.get(b)) System.out.println(map.get(a) + " > " + map.get(b));
                else if (map.get(a) < map.get(b)) System.out.println(map.get(a) + " < " + map.get(b));
                else System.out.println(map.get(a) + " = " + map.get(b));
            }
        }
    }
}
