import java.util.Scanner;

public class Information {
    Scanner input = new Scanner(System.in);
    void info() {
        System.out.print("İsminizi giriniz : ");
        String name = input.next();
        System.out.print("Soyadınızı giriniz : ");
        String surname = input.next();
        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();
        System.out.print("Numaranızı giriniz : ");
        int id = input.nextInt();
        System.out.print("Burs durumunuz : ");
        boolean scholarship = input.nextBoolean();
        System.out.println("Adınız : " + name);
        System.out.println("Soyadınız : " + surname);
        System.out.println("Yaşınız : " + age);
        System.out.println("Numaranız : " + id);
        System.out.println("Burs durumu : " + scholarship);
    }

}
