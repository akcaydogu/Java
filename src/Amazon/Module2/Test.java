package Amazon.Module2;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("yaş : ");
        int age = sc.nextInt();

        System.out.println("adınızı giriniz : ");
        String name = sc.next().toLowerCase();

        if(age<18) {
            System.out.println("Bu mert la");
        }
        else{
            System.out.println("a");

        }
        //ben diziler nasıl çalışıyo unuttum!!!! -baba tamam?
        String[] names = {"Mert", "Mert Mücahit", "Mert Mücahit Yurtseven"};
        for(String name2 : names) {
            name2 = name2.toLowerCase();
            if(name.contains(name2))
                System.out.println("Ha bu pijtir");
            else{
                System.out.println("hoş geldiniz "+name);
                break;
            }
        }

    }
}
