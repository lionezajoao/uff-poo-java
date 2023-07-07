import java.util.List;

public class Series extends Media {
    private List<Season> seasonList;

    public Series(String title, int length, String releaseDate, List<String> genres, List<Person> directorList, List<Person> castList, List<Season> seasonList) {
        super(title, length, releaseDate, genres, directorList, castList);
        this.seasonList = seasonList;
    }

    void addSeason(Season season) {
        this.seasonList.add(season);
    }

    void removeSeason(Season season) {
        this.seasonList.remove(season);
    }
}
