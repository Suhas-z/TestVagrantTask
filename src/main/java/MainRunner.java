public class MainRunner {

    public static void main(String[] args) {
       /* RecentlyPlayedSongs recentlyPlayedSongs = new RecentlyPlayedSongs(3);
        recentlyPlayedSongs.addSong("s1","User1");
        recentlyPlayedSongs.addSong("s2","User1");
        recentlyPlayedSongs.addSong("s3","User1");
        recentlyPlayedSongs.addSong("s4","User1");

        System.out.println(recentlyPlayedSongs.getRecentlyPlayedSongs("User1"));*/

        RecentlyPlayedSong recentlyPlayedSong = new RecentlyPlayedSong(3);
        recentlyPlayedSong.add("User1",new Song("S1"));
        recentlyPlayedSong.add("User1",new Song("S2"));
        recentlyPlayedSong.add("User1",new Song("S3"));
        recentlyPlayedSong.add("User1",new Song("S4"));

        recentlyPlayedSong.getRecentlyPlayed("User1").stream().forEach(s-> System.out.println(s.getName()));

    }
}
