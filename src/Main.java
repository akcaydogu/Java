import Amazon.AmazonLabIndex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MathLib mathLib = new MathLib();
        Calculate calc = new Calculate();
        Triangle triangle = new Triangle();
        Midterm midterm = new Midterm();
        Information information = new Information();
        int option;
        do {
            System.out.println("Lütfen çalıştırmak istediğiniz programın numarasını giriniz.");
            System.out.println("1. Agno");
            System.out.println("2. Üçgen");
            System.out.println("3. Vize");
            System.out.println("4. Bilgi");
            System.out.println("5. Math Library");
            option = input.nextInt();
            if ( option == 1 ) {
                System.out.println("Kaç dersiniz bulunmaktadır?");
                int l = input.nextInt();
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
                triangle.triangle();
            } else if ( option == 3 ) {
                midterm.midTermCalculation();
            } else if ( option == 4 ) {
                information.info();
            } else if ( option == 5 ) {
                System.out.println("İşlem seçiniz: \n\t1-Power \n\t2-Absolute Value \n\t3-Floor-Ceiling-Round\n\t\t1-Floor\n\t\t2-Ceiling\n\t\t3-Round");
                double x = input.nextDouble();
                double y = input.nextDouble();
            } else if (option == 6) {
                mathLib.triangleArea(3,4,5);
            } else if ( option == 7 ) {
                mathLib.rootOfPolinom(1,-6,8);
            } else if ( option == 8 ) {
                mathLib.reverseNumber(213123123312232L);

            }
        } while (option != 0);



    }
}
