import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();

        while (true) {
            System.out.println("Indtast filmens navn:");
            String titel = scanner.nextLine();

            if (titel.equalsIgnoreCase("Slut")) {
                break;
            }

            System.out.println("Hvem er filmens instruktør?:");
            String instruktør = scanner.nextLine();

            System.out.println("Er filmen i farve? (ja/nej):");
            String farve = scanner.nextLine();

            System.out.println("Hvor lang er filmen i minutter?:");
            int længde = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Hvilket år kom filmen ud?:");
            int år = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Hvad er filmens genre?:");
            String genre = scanner.nextLine();

            Movie movie = new Movie(titel, instruktør, farve.equalsIgnoreCase("ja"), længde, år, genre);
            movieCollection.addMovie(movie);

            System.out.println("Filmen blev tilføjet til samlingen!");
        }

        System.out.println("\nFilmsamlingen:");
        movieCollection.printMovies();
    }
}