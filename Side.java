public class Side {

    String name;
    String lang;
    String genre;
    String date;
    Float ratings;
    static String country;

    Side() {
        System.out.println("Recently released movies:");
    }

    @Override
    public String toString() {
        return "{Moviename : " + name + ", Language : " + lang + ", Country : " + country +
                ", Genre : " + genre + "Release date : " + date + "Ratings : " + ratings + "}";
    }

}
