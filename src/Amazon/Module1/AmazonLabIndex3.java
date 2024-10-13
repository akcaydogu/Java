package Amazon.Module1;

public class AmazonLabIndex3 {

    public static void main( String [] args) {

        //Declaring first name and last name
        String firstName = "Sandy";
        String lastName = "Jones";

        //Declaring movie title
        String movieTitle = "The Source Code";

        //Declaring number of tickets for movie
        int numberOfTicket = 8;

        //Declaring price of ticket.
        double priceOfTicket = 10.57;

        //Declaring total price.
        double totalPrice = numberOfTicket * priceOfTicket;

        //Declaring username using firstName and lastName.
        String userName = firstName.toLowerCase() + lastName.toLowerCase();

        //Declaring name of movie by upper case title.
        String movieName = movieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: " + userName);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTicket);
        System.out.println("Price of Ticket: " + priceOfTicket);
        System.out.println("Total Price: " + totalPrice);

        System.out.println(
                "\nThank you for choosing us for booking your movie tickets\n" +
                "Enjoy your movie!!!"
        );

    }

}
