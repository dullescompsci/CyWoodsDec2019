import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("trivia.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name1 = sc.next(), name2 = sc.next();
            ArrayList<String> list = new ArrayList<>();
            sc.nextLine();
            String line = sc.nextLine();
            //System.out.println(line);
            Scanner inp = new Scanner(line);
            while(inp.hasNext()) list.add(inp.next()); //answer key

            int s1 = 0, s2 = 0;
            line = sc.nextLine();
            inp = new Scanner(line);
            //System.out.println(line);
            for (int j = 0; j < list.size(); j++) {
                String ans1 = inp.next(), ans2 = inp.next();
                if (ans1.equals(list.get(j))) s1++;
                if (ans2.equals(list.get(j))) s2++;
            }

            if (s1 > s2) System.out.println(name1 + " has won this round!");
            if (s2 > s1) System.out.println(name2 + " has won this round!");
            else System.out.println(name1 + " and " + name2 + " are tied this round!");


        }
    }
}
