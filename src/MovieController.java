import java.util.ArrayList;
import java.util.List;

public class MovieController {
private List<Movie> movies;

public MovieController(){
    movies = new ArrayList<>();
} public void addMovie(Movie movie){
    movies.add(movie);
    } public void printMovies(){
    for(int i = 0; i < movies.size(); i++){
        System.out.println((i + 1) + "." + movies.get(i));
    }
    }
}
