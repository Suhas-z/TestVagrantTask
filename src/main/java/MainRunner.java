public class MainRunner {

    public static void main(String[] args) {
        RecentlyPlayedSong recentlyPlayedSong = new RecentlyPlayedSong(3);
        recentlyPlayedSong.add("User1", "S1");
        recentlyPlayedSong.add("User1", "S2");
        recentlyPlayedSong.add("User1", "S3");
        recentlyPlayedSong.add("User1", "S4");

        recentlyPlayedSong.getRecentlyPlayed("User1").stream().forEach(System.out::println);

    }
}
