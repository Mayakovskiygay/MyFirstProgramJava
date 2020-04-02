import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("Введите выражение");
            double a = s.nextDouble();
            char c = s.next().charAt(0);
            double b = s.nextDouble();
            switch(c){
                case('-'):
                    System.out.println(a - b);
                    break;
                case ('+'):
                    System.out.println(a + b);
                    break;
                case ('/'):
                    System.out.println(a / b);
                    break;
                case ('*'):
                    System.out.println(a * b);
                    break;
                default:
                    System.out.println("Неверно");
            }


        }

    }
}

