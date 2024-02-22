import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tilføj en ny film");
            System.out.println("2. Slut");
            System.out.print("Indtast dit valg: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addMovie(movieCollection, scanner);
                    break;
                case 2:
                    System.out.println("Slutter programet");
                    break;
                default:
                    System.out.println("Ugyldigt valg.");
            }
        } while (choice != 2);
    }

    private static void addMovie(MovieCollection movieCollection, Scanner scanner) {
        System.out.println("\nIndtast filmens navn:");
        String titel = scanner.nextLine();

        System.out.println("Hvem er filmens instruktør:");
        String instruktør = scanner.nextLine();

        System.out.println("Er filmen i farve? (ja/nej):");
        String farve = scanner.nextLine();

        System.out.println("Hvor lang er filmen i minutter?:");
        int længde = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hvilket år kom filmen ud?:");
        int år = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hvad er filmens genren?:");
        String genre = scanner.nextLine();

        Movie movie = new Movie(titel, instruktør, farve.equalsIgnoreCase("ja"), længde, år, genre);
        movieCollection.addMovie(movie);

        System.out.println("Filmen blev tilføjet til samlingen!");
    }
}