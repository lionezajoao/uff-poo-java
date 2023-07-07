import java.util.List;

public class Media {
    String title;
    int length;
    String releaseDate;
    List<String> genres;
    List<Person> directorList;
    List<Person> castList;

    public Media(String title, int length, String releaseDate, List<String> genres, List<Person> directorList, List<Person> castList) {
        this.title = title;
        this.length = length;
        this.releaseDate = releaseDate;
        this.genres = genres;
        this.castList = castList;
        this.directorList = directorList;
        this.castList = castList;
    }

    void addCast(Person person) {
        this.castList.add(person);
    }

    void addDirector(Person director) {
        this.directorList.add(director);
    }

    void removeCast(Person cast) {
        this.castList.remove(cast);
    }

    void removeDiretor(Person director) {
        this.directorList.remove(director);
    }

    void addGenre(String genre) {
        this.genres.add(genre);
    }

    void removeGenre(String genre) {
        this.genres.remove(genre);
    }
}
