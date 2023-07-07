import java.util.*;

public class Karaoke {
    private List<String> musicList;
    private Map<String, String> musicMap;
    private List<String> queue;

    public Karaoke() {
        musicList = new ArrayList<>();
        musicMap = new HashMap<>();
        queue = new ArrayList<>();
    }

    public void addMusic(String artist, String song) {
        String key = artist + " - " + song;
        musicList.add(key);
        musicMap.put(key, song);
    }

    public void addToQueue(String artist, String song) {
        String key = artist + " - " + song;
        queue.add(key);
    }

    public void playNext() {
        if (!queue.isEmpty()) {
            String songKey = queue.remove(0);
            String song = musicMap.get(songKey);
            System.out.println("Playing: " + songKey);
            System.out.println("Song: " + song);
        } else {
            System.out.println("Queue is empty. Add songs to the queue.");
        }
    }

    public void displayMusicList() {
        System.out.println("Available Music:");
        for (String songKey : musicList) {
            System.out.println(songKey);
        }
    }

    public static void main(String[] args) {
        Karaoke karaoke = new Karaoke();

        // Adicionando algumas músicas à lista de músicas disponíveis
        karaoke.addMusic("Artist 1", "Song 1");
        karaoke.addMusic("Artist 2", "Song 2");
        karaoke.addMusic("Artist 3", "Song 3");

        // Exibindo a lista de músicas disponíveis
        karaoke.displayMusicList();

        // Adicionando músicas à fila de reprodução
        karaoke.addToQueue("Artist 1", "Song 1");
        karaoke.addToQueue("Artist 2", "Song 2");
        karaoke.addToQueue("Artist 3", "Song 3");

        // Tocando a próxima música na fila
        karaoke.playNext();
    }
}
