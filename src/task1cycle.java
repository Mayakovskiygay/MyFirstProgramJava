import java.util.Scanner;

public class task1cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        for (int x=a; x<b; x++){
            if (x%2 ==0){
                System.out.println(x);
            }
        }


    }
}
