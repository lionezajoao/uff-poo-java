import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Movie> movieList;
    private List<Series> seriesList;

    public Catalog() {
        movieList = new ArrayList<>();
        seriesList = new ArrayList<>();
    }

    public void addMovie(Movie content) {
        movieList.add(content);
    }

    public void addSeries(Series content) {
        seriesList.add(content);
    }

    public void removeMovie(Movie content) {
        movieList.remove(content);
    }

    public void removeSeries(Series content) {
        seriesList.remove(content);
    }

    public void listMovies() {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    public void listSeries() {
        for (Series series : seriesList) {
            System.out.println(series);
        }
    }
}
