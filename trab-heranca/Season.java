import java.util.List;

public class Season {
    private int epCount;
    private List<Episode> episodes;
    private String releaseDate;

    public Season(int epCount, List<Episode> episodes, String releaseDate) {
        this.epCount = epCount;
        this.episodes = episodes;
        this.releaseDate = releaseDate;
    }

    public void addEpisode(Episode episode) {
        this.episodes.add(episode);
        this.epCount += 1;
    }

    public void removeEpisode(Episode episode) {
        this.episodes.remove(episode);
        this.epCount -= 1;
    }
}
