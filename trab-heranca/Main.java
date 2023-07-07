import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Movie movie = new Movie(
            "Vasco da Gama",
            180,
            "28/12/1997",
            List.of("Drama", "Terror"),
            List.of(new Person("777 Partners", "23/06/2023", "Director", null)),
            List.of(new Person("Léo Pelé", "28/12/1997", "Actor", null))
        );
        
        Series series = new Series(
            "Breaking Bad",
            55,
            "11/11/2011",
            List.of("Drama", "Action"),
            List.of(
                new Person("Vince Gilligan", "28/12/1997", "Director", List.of("Emmys"))
            ),
            List.of(
                new Person("Walter White", "06/04/1964", "Actor", List.of("Emmys"))
            ),
            List.of(new Season(1, List.of(new Episode("Pilot", "12/12/2009", 50)), null))
        );

        catalog.addMovie(movie);
        catalog.addSeries(series);

        catalog.listMovies();
        catalog.listSeries();

    }
}
