import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Lütfen çalıştırmak istediğiniz programın numarasını giriniz.");
            System.out.println("1. Agno");
            System.out.println("2. Üçgen");
            System.out.println("3. Vize");
            System.out.println("4. Bilgi");
            option = input.nextInt();
            if ( option == 1 ) {
                System.out.println("Kaç dersiniz bulunmaktadır?");
                int l = input.nextInt();
                Calculate calc = new Calculate();
                for (int i = 1; i <= l; i++ ) {
                    System.out.println("Lütfen ders ismi giriniz.");
                    String name = input.next();
                    System.out.println("Lütfen ders notunuzu giriniz.");
                    int g = input.nextInt();
                    System.out.println("Lütfen ders kredisini giriniz");
                    int k = input.nextInt();

                    calc.calculateAgno(g, k, name);
                }
                System.out.println(calc.score/calc.total);
                System.out.println((Math.ceil(calc.score/calc.total*10))/10);
                System.out.println(calc.noteGrade);
            } else if ( option == 2 ) {
                Triangle triangle = new Triangle();
                triangle.triangle();
            } else if ( option == 3 ) {
                Midterm midterm = new Midterm();
                midterm.midTermCalculation();
            } else if ( option == 4 ) {
                Information information = new Information();
                information.info();
            }
        } while (option != 0);



    }
}
