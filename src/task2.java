import java.util.Locale;
import java.util.Scanner;

public class task2 {
    public static Scanner scanner= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Ввод данных");
        scanner.useLocale(Locale.UK);
        double x = Read();
        double y = Read();
        String c = Get(x, y);
        System.out.println(c);
    }
    private static String Get(double x, double y) {
        if (y > 0) {
            if (y - x * x + 2 > 0 && y - x < 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        if (y < 0) {
            if (y - x * x + 2 > 0 && y + x < 0) {
                return "YES";
            } else {
                return "NO";
            }
        };


        return null;
    }
    private static double Read(){
        return scanner.nextDouble();
    }
}

