import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //biniş = 2 abonman aktarma = 1 abonman
        double subscriptionPrice = 450d;
        double subscriptionRemaining = 200d;
        double ticketBinPrice = 9.76d;
        double ticketAktPrice = 4.28d;
        double total = 200;

        System.out.println("Lütfen Günlük biniş sayınızı giriniz : ");
        int ticketBin = scanner.nextInt()*30;
        System.out.println("Lütfen Günlük aktarma sayısını giriniz : ");
        int ticketAkt = scanner.nextInt()*30;
        double totalPrice= (ticketBinPrice*ticketBin)+(ticketAktPrice*ticketAkt);
        
        if(ticketAkt+ticketBin*2 < subscriptionRemaining) {
            System.out.println("Sadece " + (ticketAkt+ticketBin*2) + " hakkı kullandınız" );
            System.out.println("Kalan Abonman Hakkınız "+ (int)(subscriptionRemaining-(ticketAkt+ticketBin*2)) +"'dır");
            if(subscriptionPrice > totalPrice){
                System.out.println("Akbil basmak daha mantıklı " + (float)(subscriptionPrice-totalPrice) + "TL kâr");
            } else if (subscriptionPrice < totalPrice){
                System.out.println("Abonman daha mantıklı " + (float)(totalPrice-subscriptionPrice) + "TL kâr");

            } else {
                System.out.println("Keyfine göre 🤓");
            }
        } else if(ticketAkt+ticketBin*2 > subscriptionRemaining) {
            for (int i = 1; i<=30; i++) {
                if ( total <= 200) {
                    total -= ticketBin/30;
                    ticketBin -= ticketBin/30;
                } else {
                    break;
                }
                if ( total <= 200) {
                    total -= ticketAkt/30;
                    ticketAkt -= ticketAkt/30;
                } else {
                    break;
                }
            }
            System.out.println("Kalan akt" + ticketAkt + "Kalana bin" + ticketBin);
        }








    }

}
