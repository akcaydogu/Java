import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //biniş = 2 abonman aktarma = 1 abonman
        double subscriptionPrice = 450d;
        double subscriptionRemaining = 200d;
        double ticketBinPrice = 9.76d;
        double ticketAktPrice = 4.28d;
        double extraPrice = 0d;

        System.out.println("Lütfen Günlük biniş sayınızı giriniz : ");
        int ticketBin = scanner.nextInt();
        System.out.println("Lütfen Günlük aktarma sayısını giriniz : ");
        int ticketAkt = scanner.nextInt();
        double totalPrice= (ticketBinPrice*ticketBin)*30+(ticketAktPrice*ticketAkt)*30;
        
        if((ticketAkt+ticketBin*2)*30 < subscriptionRemaining) {
            System.out.println("Sadece " + ((ticketAkt+ticketBin*2)*30) + " hakkı kullandınız" );
            System.out.println("Kalan Abonman Hakkınız "+ (int)(subscriptionRemaining-(ticketAkt+ticketBin*2)*30) +"'dır");
            if(subscriptionPrice > totalPrice){
                System.out.println("Akbil basmak daha mantıklı " + (float)(subscriptionPrice-totalPrice) + "TL kâr");
            } else if (subscriptionPrice < totalPrice){
                System.out.println("Abonman daha mantıklı " + (float)(totalPrice-subscriptionPrice) + "TL kâr");

            } else {
                System.out.println("Keyfine göre 🤓");
            }
        } else {
            for ( int i = 1; i <= 30; i++) {
                subscriptionRemaining -= ticketBin*2 + ticketAkt;
                System.out.println(subscriptionRemaining);
                if (subscriptionRemaining <= 0) {
                    ticketBin *= 30-i;
                    ticketAkt *= 30-i;
                    extraPrice = (ticketAktPrice+ticketBinPrice)/2*Math.abs(subscriptionRemaining);
                    break;
                }
            }
            System.out.println(ticketBin);
            System.out.println(ticketAkt);
            System.out.println("Tüm abonman hakkınızı bitirdiniz");
            System.out.println("Toplam harcamanız 200 abonman hakkı ve " + (ticketBin*ticketBinPrice+ticketAkt*ticketAktPrice+extraPrice) + " TL harcamanız bulunmaktadır");
        }

    }

}
