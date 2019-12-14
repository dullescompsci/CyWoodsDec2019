import java.io.*;
import java.util.*;

public class Sandwiches {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("sandwiches.dat"));
        Stack<String> bread = new Stack<>(), meat = new Stack<>(), cheese = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("-");
            if (arr[1].equals("bread")) bread.add(arr[0]);
            if (arr[1].equals("meat")) meat.add(arr[0]);
            if (arr[1].equals("cheese")) cheese.add(arr[0]);
        }

        int minLen = Math.min(bread.size(), Math.min(meat.size(), cheese.size()));
        for (int i = 0; i < minLen; i++) {
            System.out.println(bread.pop() + ", " + meat.pop() + ", " + cheese.pop());
        }
    }
}
