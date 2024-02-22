import java.util.List;
import java.util.Scanner;

public class MovieController {
    private MovieCollection movieCollection;

    public MovieController() {
        movieCollection = new MovieCollection();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int valg;

        do {
            System.out.println("1. Tilføj en ny film");
            System.out.println("2. Se alle film i samlingen");
            System.out.println("3. Se detaljer om filmen");
            System.out.println("4. Søg efter en film");
            System.out.println("5. For at lukke programmet");
            valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Indtast titlen på filmen: ");
                    String title = scanner.next();
                    System.out.print("Hvem er instruktør?: ");
                    String instruktør = scanner.next();
                    System.out.print("Er film i farve? (true/false)? ");
                    boolean isColor = scanner.nextBoolean();
                    System.out.println("Hvilket år kom filmen ud i?");
                    int år = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Hvor mange minutter er filmen?: ");
                    int lengthInMinutes = scanner.nextInt();
                    System.out.print("Indtast filmens genre: ");
                    String genre = scanner.next();

                    Movie newMovie = new Movie(title, instruktør, isColor, år, lengthInMinutes, genre);
                    movieCollection.addMovie(newMovie);
                    break;
                case 2:
                    movieCollection.printAllMovies();
                    break;
                case 3:
                    System.out.print("Indtast indexet for at se detaljerne: ");
                    int index = scanner.nextInt();
                    movieCollection.printMovieDetails(index);
                    break;
                case 4:
                    System.out.println("Indtast film du leder efter");
                    String searchterm = scanner.nextLine();
                    List<Movie> searchResults = movieCollection.searchMovies(searchterm);
                    if (searchResults.isEmpty()){
                        System.out.println("Ingen film fundet");
                    } else {
                        System.out.println("Film fundet");
                        for (Movie movie : searchResults){
                            System.out.println(movie);
                    }
                    } break;


                case 5:
                    System.out.println("Farvel!");
                    break;

                default:
                    System.out.println("Ugyldigt valg. prøv igen.");
            }
        } while (valg != 5);

        scanner.close();
    }
}