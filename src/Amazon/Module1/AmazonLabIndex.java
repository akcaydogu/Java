package Amazon.Module1;

public class AmazonLabIndex {

    public static void main(String[] args) {

        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        String bookTitle2 = "Java programming is fun and educational";
        int titleLength = bookTitle.length();
        int titleLength2 = bookTitle2.length();
        System.out.println("Length of the book title: " + titleLength);
        System.out.println("Length of the book title2: " + titleLength2);


        //Declare and initialise the length of shortened book title
        int maxLength = 20;
        int maxLength2 = 17;


        // Shortened the book title
        String shortBookTitle = bookTitle.substring(0, maxLength);
        String shortBookTitle2 = bookTitle2.substring(0, maxLength2);
        System.out.println("Original title: " + bookTitle);
        System.out.println("Shortened title: " + shortBookTitle);
        System.out.println("Original title: " + bookTitle2);
        System.out.println("Shortened title: " + shortBookTitle2);

        // Declare and initialize the searchWord
        String searchWord = "Captain";
        String searchWord2 = "fun";

        // Check if the searchWord is present in book title
        boolean containsWord = bookTitle.contains(searchWord);
        boolean containsWord2 = bookTitle2.contains(searchWord2);
        System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);
        System.out.println("Does the title contain the word \"" + searchWord2 + "\"? " + containsWord2);

        //Replace "educational" with "awesome"
        String replacedWord = bookTitle2.replace("educational", "awesome");
        System.out.println("Replaced word: " + replacedWord);

    }

}
