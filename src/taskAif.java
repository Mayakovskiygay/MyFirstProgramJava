import java.util.Scanner;

public class taskAif {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            if (N % 10 <= 4 && N % 10 > 1) {
                System.out.println("bochki");
            } else {
                if (N % 10 == 0 || N % 10 > 4) {
                    System.out.println("bochek");
                } else {
                    if (N % 10 == 1) {
                        System.out.println("bochka");
                    }
                }


            }

        }
    }
}