public class Movie {

    public String name;
    public String lang;
    public String genre;
    public String date;
    public Float ratings;
    public Crew crew;

    @Override
    public String toString() {
        return "Movie [name=" + name + ", lang=" + lang + ", genre=" + genre + ", date=" + date + ", ratings=" + ratings
                + ", crew:" + crew + "]";
    }

}