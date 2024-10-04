import java.util.Scanner;
public class Midterm {
    void  midTermCalculation() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Vize notunuzu giriniz : ");
        float midTerm1 = input.nextFloat();
        System.out.print("2. Vize notunuzu giriniz : ");
        float midTerm2 = input.nextFloat();
        System.out.print("Final notunuzu giriniz : ");
        float finalTerm = input.nextFloat();
        System.out.println("Dönem sonu ortalamanız : " + (midTerm1*.3 + midTerm2*.3 + finalTerm*.4) );
    }
}
