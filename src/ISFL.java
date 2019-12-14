import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ISFL {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("isfl.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(sc.nextLine());
        }
    }
}

class Team implements Comparable {
    ArrayList<String> names;
    String name;
    public Team(ArrayList<String> names, String name) {
        this.names = names;
        this.name = name;
    }

    public int compareTo(Object o) {
        Team obj = (Team) o;
        return this.name.compareTo(obj.name);
    }
}