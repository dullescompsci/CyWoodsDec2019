import java.io.*;
import java.util.*;
public class Bens {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("bens.dat"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ArrayList<Ben> b = new ArrayList<>();
            String inp = sc.nextLine();
            int test = Integer.parseInt(inp);
            for (int j = 0; j < test; j++) {
                sc.next();
                String name = sc.next();
                double grade = sc.nextDouble();
                int vLow = sc.nextInt(), vHigh = sc.nextInt();
                double femur = sc.nextDouble();
                if (sc.hasNextLine()) sc.nextLine();
                b.add(new Ben(name, grade, vLow, vHigh, femur));
            }
            Collections.sort(b);

            String result = "";
            for (int j = 0; j < test; j++) {
                result += "Ben " + b.get(j).name + ", ";
            }

            System.out.println(result.substring(0, result.length() - 2));


        }
    }
}

class Ben implements Comparable {
    String name;
    double grade;
    int vocal;
    double femur;
    public Ben(String name, double grade, int vLow, int vHigh, double femur) {
        this.name = name;
        this.grade = grade;
        vocal = vHigh - vLow;
        this.femur = femur;
    }

    public int compareTo(Object o) {
        Ben obj = (Ben) o;
        if (this.grade < obj.grade) return -1;
        if (this.grade > obj.grade) return 1;
        if (this.vocal < obj.vocal) return -1;
        if (this.vocal > obj.vocal) return 1;
        if (this.femur < obj.femur) return -1;
        if (this.femur > obj.femur) return 1;
        return 0;
    }
}