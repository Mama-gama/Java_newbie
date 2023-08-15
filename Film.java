public class Film {
  public static void main(String[] a) {

    Movie movie = new Movie();
    Crew crew = new Crew();

    movie.name = "Avatar:the way of water";
    movie.lang = "English";
    movie.genre = "Sci-fi";
    movie.date = "16 dec 2022";
    movie.ratings = 7.6f;
    crew.dir = "James Cameron";
    crew.production = "lightstorm";
    crew.music = "someone";
    crew.Cast1 = "Sam";
    crew.Cast2 = "Zoe";

    System.out.println("movies : " + movie);

  }

}
