import java.util.List;

public class Movie extends Media {
    public Movie(String title, int length, String releaseDate, List<String> genres, List<Person> directorList, List<Person> castList) {
        super(title, length, releaseDate, genres, directorList, castList);
    }
}
