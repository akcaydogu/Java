import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Son
{

    public static void main(String[] args) {

        float g = 9.8f;
        float l = 2;
        float h = 0.5f;
        List<String> liste = new ArrayList<>();

//        for (float i = 0; i<=45; i+=0.1){
//            float x = Math.sqrt(2*g*(h-(1-Math.cos(Math.toRadians(i)))));
//            System.out.println("Açı : " + i + "Hız : " + x);
//        }

        System.out.println("----------");
        for (float i = 0; i<=45.1; i+=0.1f){
            float x = (float) Math.sqrt(g*(1-2*(1-Math.cos(Math.toRadians(i)))));
            float v = (float) Math.sqrt(2*g*((l*(1-Math.cos(Math.toRadians(45)))+0.5)-(l*(1-Math.cos(Math.toRadians(i)))+0.5)));
            System.out.println("Açı : " + i + " Hız : " + v + " Yatay Hız : " +  (float) (v*Math.cos(Math.toRadians(i))) + " Dikey Hız : " +  (float) (v*Math.sin(Math.toRadians(i))) + " Yükseklik : " + (float) (l*(1-Math.cos(Math.toRadians(i)))+0.5));
            liste.add("Açı : " + i + " Hız : " + v + " Yatay Hız : " +  (float) (v*Math.cos(Math.toRadians(i))) + " Dikey Hız : " +  (float) (v*Math.sin(Math.toRadians(i))) + " Yükseklik : " + (float) (l*(1-Math.cos(Math.toRadians(i)))+0.5));
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd_HH.mm.ss");
        String tarihSaat = LocalDateTime.now().format(formatter);
        String dosyaAdi = "veriListesi.txt_" + tarihSaat;
        dosyayaYaz(liste, dosyaAdi);
    }

    public static void dosyayaYaz(List<String> liste, String dosyaAdi) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
            for (String veri : liste) {
                writer.write(veri);
                writer.newLine();  // Her veri için yeni satır
            }
            System.out.println("Veriler başarıyla dosyaya yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
        }
    }

}
