import java.util.Locale;
import java.util.Scanner;

public class task1 {
   public static Scanner scanner= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Ввод данных");
        scanner.useLocale(Locale.UK);
        double x = Read();
        double y = Read();
        String c = Get(x, y);
        System.out.println(c);
    }
    private static String Get(double x, double y){
            if (x * x + y * y > 4 && y - x < 0 && x < 2 && x > 0 && y > 0) {
                return "YES";
            } else {
                return "NO";
            }




    }
    private static double Read(){
       return scanner.nextDouble();
    }
}
