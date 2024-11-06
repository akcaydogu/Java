import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //biniş = 2 abonman aktarma = 1 abonman
        double subscriptionPrice = 282.5d;
        double subscriptionRemaining = 200d;
        double ticketBinPrice = 9.76d;
        double ticketAktPrice = 4.28d;
        double extraPrice = 0f;

        System.out.println("Lütfen Günlük biniş sayınızı giriniz : ");
        int ticketBin = scanner.nextInt();
        System.out.println("Lütfen Günlük aktarma sayısını giriniz : ");
        int ticketAkt = scanner.nextInt();
        System.out.println("Lütfen kaç gün kullandığınızı giriniz : ");
        int day = scanner.nextInt();
        double totalPrice= (ticketBinPrice*ticketBin)*day+(ticketAktPrice*ticketAkt)*day;
        
        if((ticketAkt+ticketBin*2)*day < subscriptionRemaining) {
            System.out.println("Sadece " + ((ticketAkt+ticketBin*2)*day) + " hakkı kullandınız" );
            System.out.println("Kalan Abonman Hakkınız "+ (int)(subscriptionRemaining-(ticketAkt+ticketBin*2)*day) +"'dır");
            if(subscriptionPrice > totalPrice){
                System.out.println("Akbil basmak daha mantıklı " + (float)(subscriptionPrice-totalPrice) + "TL kâr");
            } else if (subscriptionPrice < totalPrice){
                System.out.println("Abonman daha mantıklı " + (float)(totalPrice-subscriptionPrice) + "TL kâr");

            } else {
                System.out.println("Keyfine göre 🤓");
            }
        } else {
            for ( int i = 1; i <= day; i++) {
                subscriptionRemaining -= ticketBin*2 + ticketAkt;
                if (subscriptionRemaining <= 0) {
                    ticketBin *= day-i;
                    ticketAkt *= day-i;
                    extraPrice = ((ticketAktPrice*ticketAkt+ticketBinPrice*ticketBin)/(ticketAkt+ticketBin)*Math.abs(subscriptionRemaining));
                    break;
                }
            }
            System.out.println("Tüm abonman hakkınızı bitirdiniz");
            System.out.println("Toplam harcamanız 200 abonman hakkı ve " + (float)(ticketBin*ticketBinPrice+ticketAkt*ticketAktPrice+extraPrice) + " TL harcamanız bulunmaktadır");
            System.out.println("Toplam ücret " + (ticketBin*ticketBinPrice+ticketAkt*ticketAktPrice+extraPrice+subscriptionPrice) + "TL");
        }

    }

}
