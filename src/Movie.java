public class Movie {
    private String titel;
    private String instruktør;
    private boolean farvefilm;
    private int længde;
    private int år;
    private String genre;

    public Movie(String titel, String instruktør, boolean farvefilm, int længde, int år, String genre){
        this.titel = titel;
        this.instruktør = instruktør;
        this.farvefilm = farvefilm;
        this.længde = længde;
        this.år = år;
        this.genre = genre;
    } public String getTitel(){
        return titel;
    } public String getInstruktør(){
        return instruktør;
    } public boolean getfarvefilm(){
        return farvefilm;
    } public int getLængde(){
        return længde;
    } public int getÅr(){
        return år;
    }
    public String getGenre(){
        return genre;
    }
    public String toString(){
        return "Titel" + titel + "Instruktør" + instruktør + "Farve?" + farvefilm + "Længde i minutter" + længde + "Årstål for film" + år + "Genre" + genre;
    }
}
