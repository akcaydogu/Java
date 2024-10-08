import java.sql.SQLOutput;

public class MathLib {

    void mathPower(double x, double y) {
        double valueOfPower = Math.pow(x, y);
        System.out.println(valueOfPower);
    }

    void mathAbs(double x) {
        double valueOfAbs = Math.abs(x);
        System.out.println(valueOfAbs);
    }

    void mathFRC(double x, String y) {

    }
    //Üçgen Alan Problem 1 3. hafta
    void triangleArea (int x, int y, int z) {
        double s = x+y+z;
        double k = (x+y+z)/2;
        double area = Math.sqrt(k*(k-x)*(k-y)*(k-z));
        System.out.println("Alan : " + area + "\n" + "Çevre : " + s);
    }

    void rootOfPolinom(int a, int b, int c) {
        double discriminantOf = Math.pow(b, 2) - (4*a*c);
        System.out.println(discriminantOf);
        double root1 = ((-1 * b) + Math.sqrt(discriminantOf))/(2*a);
        double root2 = ((-1 * b) - Math.sqrt(discriminantOf))/(2*a);
        System.out.println("Root 1 : " + root1 + "\n" + "Root 2 : " + root2);
    }

    void reverseNumber(long a) {
        String x = "";
        for (int i = 0; i <= String.valueOf(a).length()-1; i++) {
            long number = (a / (int) Math.pow(10, i)) % 10;
            x += "" + number;
        }
        System.out.println(x);
//        int n1 = a % 10;
//        int n2 = (a / 10) % 10;
//        int n3 = (a / 100) % 10;
//        int n4 = (a / 1000) % 10;
//        System.out.println("" + n1 + "" + n2 + "" + n3 + "" + n4);
    }
}
