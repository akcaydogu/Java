package Amazon.Module2;
import java.util.Scanner;

public class AmazonLab_1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter a flavor you want for ice cream.");
//        String flavor = scanner.nextLine();
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
        for(String meyve: cars) {
            System.out.println(meyve);
        }

//        switch(flavor) {
//            case "Strawberry":
//                System.out.println("Strawberry is good choice");
//                break;
//            case "Vanilla":
//                System.out.println("Vanilla is good choice");
//
//
//        }


    }


}
