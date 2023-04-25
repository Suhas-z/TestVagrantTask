import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class RecentlyPlayedSongTest {
    @Test
    public void testAddSongAndGetRecentlyPlayedSongs() {
        RecentlyPlayedSong playList = new RecentlyPlayedSong(2);

        // add some songs for user1
        playList.add("user1", "song1");
        playList.add("user1", "song2");
        playList.add("user1", "song3");

        // add some songs for user2
        playList.add("user2", "song4");
        playList.add("user2", "song5");

        // check that user1's recently played list contains song2 and song3
        List<String> user1RecentSongs = playList.getRecentlyPlayed("user1");
        Assert.assertEquals(2, user1RecentSongs.size());
        Assert.assertEquals(Arrays.asList("song3", "song2"), user1RecentSongs);

        // check that user2's recently played list contains song5 and song4
        List<String> user2RecentSongs = playList.getRecentlyPlayed("user2");
        Assert.assertEquals(2, user2RecentSongs.size());
        Assert.assertEquals(Arrays.asList("song5", "song4"), user2RecentSongs);

        // add another song for user1
        playList.add("user1", "song4");

        // check that user1's recently played list now contains song4 and song3 (song2 has been removed)
        user1RecentSongs = playList.getRecentlyPlayed("user1");
        Assert.assertEquals(2, user1RecentSongs.size());
        Assert.assertEquals(Arrays.asList("song4", "song3"), user1RecentSongs);

        // add another song for user2
        playList.add("user2", "song6");

        // check that user2's recently played list now contains song6 and song5 (song4 has been removed)
        user2RecentSongs = playList.getRecentlyPlayed("user2");
        Assert.assertEquals(2, user2RecentSongs.size());
        Assert.assertEquals(Arrays.asList("song6", "song5"), user2RecentSongs);


    }
}