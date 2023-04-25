import java.util.*;

public class RecentlyPlayedSong {
    private int capacity;
    private Map<String, LinkedList<String>> store;

    public RecentlyPlayedSong(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<String, LinkedList<String>>();
    }

    public void add(String user, String song) {
        LinkedList<String> songsList = store.get(user);
        if (songsList == null) {
            songsList = new LinkedList<String>();
            store.put(user, songsList);
        }

        songsList.remove(song);
        songsList.addFirst(song);

        if (songsList.size() > capacity) {
            songsList.removeLast();
        }
    }

    public List<String> getRecentlyPlayed(String user) {
        LinkedList<String> songsList = store.get(user);
        if (songsList == null) {
            return Collections.emptyList();
        }
        return new ArrayList<String>(songsList);
    }
}
