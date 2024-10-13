package Amazon.Module2;
import java.util.Scanner;

public class AmazonLab_1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double period, length, gravity;

        System.out.println("Enter period: ");
        period = scanner.nextDouble();
        System.out.println("Enter length: ");
        length = scanner.nextDouble();
        System.out.println("Enter gravity: ");
        gravity = scanner.nextDouble();

        period = 2*Math.PI*Math.sqrt(length/gravity);

        System.out.println("Period: " + period);



    }


}
