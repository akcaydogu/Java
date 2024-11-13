import java.util.Scanner;

public class Vize {

    public static void main(String[] args) {
        int x1, x2, x3, x4;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x1 = x / 1000 % 10;
        x2 = x / 100 % 10;
        x3 = x / 10 % 10;
        x4 = x % 10;
        System.out.printf("%d %d %d %d %n", x1, x2, x3, x4);
        if(x1 == x4 && x2 == x3) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
