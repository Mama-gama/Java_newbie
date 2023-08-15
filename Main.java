import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Side> movies = new ArrayList<>();

        Side.country = "India";

        Side side = new Side();

        side.name = "Maaveeran";
        side.lang = "Tamil";
        side.genre = "Fiction";
        side.date = "14 july 2023";
        side.ratings = 7.6f;
        movies.add(side);

        side = new Side();
        side.name = "Por thozhil";
        side.lang = "Tamil";
        side.genre = "Thriller";
        side.date = "9 june 2023";
        side.ratings = 8.5f;
        movies.add(side);

        side = new Side();
        side.name = "Pachuvum Athbudha vilakkum";
        side.lang = "Malayalam";
        side.genre = "Feel good";
        side.date = "28 April 2023";
        side.ratings = 7.3f;
        movies.add(side);

        side = new Side();
        side.name = "Pathaan";
        side.lang = "Hindi";
        side.genre = "Action";
        side.date = "25 Jan 2023";
        side.ratings = 8.5f;
        movies.add(side);

        System.out.println("movies : " + movies);

    }
}
