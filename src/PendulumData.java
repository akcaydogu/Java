import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PendulumData {

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Gravity
        double g = 9.81;
        //Length of rope
        System.out.print("Please enter lenght of rope :");
        double l = sc.nextDouble();
        //Height from ground
        System.out.print("Please enter height from ground :");
        double h = sc.nextDouble();
        //Angle
        System.out.print("Please enter starting angle :");
        double a = sc.nextDouble();
        //Sensivity
        System.out.print("Please enter sensivity level as Low/Med/High :");

        double result = 0;

        DataPoint maxDataPoint = null;

        List<DataPoint> dataPoints = new ArrayList<>();

        for (double i = 0; i<=a; i+=0.01){

            //? Height at the specified angle: l*(1 - cos(x)) + h
            double hl = (l * (1 - Math.cos(Math.toRadians(i))) + h);

            //? Speed formula:
            //? v = √[2 * g * ((l * (1 - cos(45°)) + h) - (l * (1 - cos(x)) + h))]
            //? This equation comes from mgh₂ = 1/2 * m * v² + mgh.
            //? h₂ represents height at 45 degrees where there is no speed component at the top
            //? while at the bottom, we use (1 - cos(45°)).
            double v = Math.sqrt(2 * g * ((l * (1 - Math.cos(Math.toRadians(a))) + h) - hl));

            //? Horizontal speed component: v * cos(x)
            double vx = (v * Math.cos(Math.toRadians(i)));

            //? Vertical speed component: v * sin(x)
            double vy = (v * Math.sin(Math.toRadians(i)));

            //? Maximum height after launch: vy² / (2 * g) + hl
            double hMax = (Math.pow(vy, 2) / (2 * g) + hl);

            //! Maximum range: vx * √[(2 * hMax) / g] + vx * (vy / g)
            //! √[(2 * hMax) Presents time
            //! This equation comes from h=v₀*t + 1/2*g*t²
            double xMax = vx * Math.sqrt((2 * hMax) / g) + vx * (vy / g);

            DataPoint dataPoint = new DataPoint(i, v, vx, vy, hl, hMax, xMax);
            dataPoints.add(dataPoint);

            if (xMax > result) {
                result = xMax;
                maxDataPoint = dataPoint;
            }
        }

        if (maxDataPoint != null) {
            maxDataPoint.isMax = true;
        }

        // Veri tablosunu yazdır
        String format2 = GREEN;
        System.out.printf("%s%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", format2, "Açı", "Hız", "Yatay Hız", "Dikey Hız", "Yükseklik", "H Max", "Yatay Max", "-Max-");
        System.out.println(BLUE + "-----------------------------------------------------------------------------");
        for (DataPoint dp : dataPoints) {
            String format = dp.isMax ? GREEN : RED;
            System.out.printf("%s%-10.2f %-10.4f %-10.4f %-10.4f %-10.4f %-10.4f %-10.8f%s%n",
                    format, dp.angle, dp.speed, dp.horizontalSpeed, dp.verticalSpeed, dp.height, dp.heightMax, dp.wayMax, dp.isMax ? " MAX" : "",RESET);
        }
        System.out.printf("%s%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", format2, "Açı", "Hız", "Yatay Hız", "Dikey Hız", "Yükseklik", "H Max", "Yatay Max", "-Max-");
        System.out.println(BLUE + "-----------------------------------------------------------------------------");
        System.out.printf("%s%-10.2f %-10.4f %-10.4f %-10.4f %-10.4f %-10.4f %-10.8f%s%n", GREEN, maxDataPoint.angle, maxDataPoint.speed, maxDataPoint.horizontalSpeed, maxDataPoint.verticalSpeed, maxDataPoint.height, maxDataPoint.heightMax, maxDataPoint.wayMax, maxDataPoint.isMax ? " MAX" : "",RESET);
    }

    // Veri noktalarını temsil eden bir iç sınıf
    static class DataPoint {
        double angle;
        double speed;
        double horizontalSpeed;
        double verticalSpeed;
        double height;
        double heightMax;
        double wayMax;
        boolean isMax = false;

        DataPoint(double angle, double speed, double horizontalSpeed, double verticalSpeed, double height, double heightMax, double wayMax) {
            this.angle = angle;
            this.speed = speed;
            this.horizontalSpeed = horizontalSpeed;
            this.verticalSpeed = verticalSpeed;
            this.height = height;
            this.heightMax = heightMax;
            this.wayMax = wayMax;
            this.isMax = false;
        }
    }
}