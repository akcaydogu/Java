import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PendulumData2 {
    // ANSI renk kodları
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        // Gravity
        double g = 9.81;
        // Length of rope
        double l = 2;
        // Height from ground
        double h = 0.5;
        // Angle
        double a = 45;

        double result = 0;
        DataPoint maxDataPoint = null;

        List<DataPoint> dataPoints = new ArrayList<>();

        for (double i = 0; i <= a; i += 0.1) {
            // Height at the specified angle: l*(1 - cos(x)) + h
            double hl = (l * (1 - Math.cos(Math.toRadians(i))) + h);

            // Speed formula:
            double v = Math.sqrt(2 * g * ((l * (1 - Math.cos(Math.toRadians(a))) + h) - hl));

            // Horizontal speed component: v * cos(x)
            double vx = (v * Math.cos(Math.toRadians(i)));

            // Vertical speed component: v * sin(x)
            double vy = (v * Math.sin(Math.toRadians(i)));

            // Maximum height after launch: vy² / (2 * g) + hl
            double hMax = (Math.pow(vy, 2) / (2 * g) + hl);

            // Maximum range calculation
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
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Açı", "Hız", "Yatay Hız", "Dikey Hız", "Yükseklik", "H Max", "Yatay Max", "Max?");
        for (DataPoint dp : dataPoints) {
            String color = dp.isMax ? GREEN : RED;
            System.out.printf("%s%-10.1f %-10.4f %-10.4f %-10.4f %-10.4f %-10.4f %-10.8f%s%n",
                    color, dp.angle, dp.speed, dp.horizontalSpeed, dp.verticalSpeed, dp.height, dp.heightMax, dp.wayMax, RESET);
        }

        // Grafik oluşturma
        JFrame frame = new JFrame("Pendulum Data Graph");
        GraphPanel graphPanel = new GraphPanel(dataPoints);
        frame.add(graphPanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
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
        boolean isMax; // Maksimum xMax değeri olan veri noktasını işaretlemek için

        DataPoint(double angle, double speed, double horizontalSpeed, double verticalSpeed, double height, double heightMax, double wayMax) {
            this.angle = angle;
            this.speed = speed;
            this.horizontalSpeed = horizontalSpeed;
            this.verticalSpeed = verticalSpeed;
            this.height = height;
            this.heightMax = heightMax;
            this.wayMax = wayMax;
            this.isMax = false; // Başlangıçta false olarak ayarlanır
        }
    }

    // Grafiği çizen sınıf
    static class GraphPanel extends JPanel {
        private final List<DataPoint> dataPoints;

        public GraphPanel(List<DataPoint> dataPoints) {
            this.dataPoints = dataPoints;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Eksen çizgileri
            g2d.drawLine(50, 500, 50, 50); // Y ekseni
            g2d.drawLine(50, 500, 800, 500); // X ekseni

            // X ekseninde açı ve Y ekseninde mesafe (yatay maksimum) ayarları
            int previousX = -1;
            int previousY = -1;

            for (DataPoint dp : dataPoints) {
                int x = (int) (dp.angle * 10) + 50; // 50 birim boşluk bırak
                int y = (int) (500 - dp.wayMax * 10); // 500 ile ters işleme

                if (previousX != -1 && previousY != -1) {
                    g2d.drawLine(previousX, previousY, x, y);
                }
                previousX = x;
                previousY = y;
            }

            // Eksen etiketleri
            g2d.drawString("Açı (Derece)", 400, 520); // X ekseni
            g2d.drawString("Mesafe (m)", 10, 250); // Y ekseni
            g2d.drawString("Grafik", 350, 30); // Başlık
        }
    }
}
