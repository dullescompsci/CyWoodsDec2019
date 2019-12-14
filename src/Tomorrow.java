import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tomorrow {
    public static ArrayList<String> nextDay(int month, int day, int year, boolean flag) {
        String m, d, y;
        switch(month) {
            case 1:
                if (day == 31) {
                    month = 2; day = 1;
                }
                else day++;
                break;

            case 2:
                if (flag) {
                    if (day == 29) {
                        month++; day = 1;
                    }
                    else day++;
                }
                else {
                    if (day == 28) {
                        month++; day = 1;
                    }
                    else day++;
                }
                break;

            case 3:
                if (day == 31) {
                    month++; day = 1;
                }
                else day++;
                break;

            case 4:
                if (day == 30) {
                    month++; day = 1;
                }
                else day++;
                break;

            case 5:
                if (day == 31) {
                    month++; day = 1;
                }
                else day++;
                break;

            case 6:
                if (day == 30) {
                    month++; day = 1;
                }
                else day++;
                break;

            case 7:
                if (day == 31) {
                    month++; day = 1;
                }
                else day++;
            case 8:
                if (day == 31) {
                    month++; day = 1;
                }
                else day++;
                break;

            case 9:
                if (day == 30) {
                    month++; day = 1;
                }
                else day++;
                break;
            case 10:
                if (day == 31) {
                    month++; day = 1;
                }
                else day++;
                break;

            case 11:
                if (day == 30) {
                    month++; day = 1;
                }
                else day++;
                break;
            case 12:
                if (day == 31) {
                    month = 1; day = 1; year++;
                }
                else day++;
                break;

        }
        ArrayList<String> dates = new ArrayList<>();
        if (month < 10) m = "0" + Integer.toString(month);
        else m = Integer.toString(month);
        if (day < 10) d = "0" + Integer.toString(day);
        else d = Integer.toString(day);

        y = Integer.toString(year);
        dates.add(m); dates.add(d); dates.add(y);
        return dates;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("tomorrow.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            int month = sc.nextInt(), day = sc.nextInt(), year = sc.nextInt();
            if (year % 4 == 0) flag = true;
            if (year % 100 == 0) flag = false;
            if (year % 400 == 0) flag = true;
            ArrayList<String> result = nextDay(month, day, year, flag);
            System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
        }
    }
}
