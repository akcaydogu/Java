package Amazon.Module1;

public class AmazonLabIndex2 {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years

        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        // Print the introduction years
        System.out.println("Introduction Years:");
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);

        System.out.println("Original name of third superhero is :" + superheroes[2]);
        superheroes[2] = "Scarlet Witch";
        System.out.println("Modified name of third superhero is :" + superheroes[2]);

        System.out.println("Original introduction year is :" + introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println("Modified introduction year is :" + introductionYears[2]);

        System.out.println("Length of superheroes array is :" + superheroes.length);
        System.out.println("Length of introduction year array is :" + introductionYears.length);

    }

}
