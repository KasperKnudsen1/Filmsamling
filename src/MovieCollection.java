public class MovieCollection {
    private Movie[] movies;
    private int movieCount;

    public MovieCollection(){
        movies = new Movie[5];
        movieCount = 0;

    } public void addMovie(Movie movie){
        if (movieCount < movies.length){
            movies[movieCount] = movie;
            movieCount++;
        } else{
            System.out.println("Film samlingen er fyldt");
        }
    } public void printMovies(){
        for (int i = 0; i < movieCount; i++){
            System.out.println((i + 1) + ". " + movies[i]);
        }
    }
}
