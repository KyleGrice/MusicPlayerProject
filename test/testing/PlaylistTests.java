/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.titanPlayer.bll.Playlist;
import com.titanPlayer.bll.Song;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kyle
 */
public class PlaylistTests {
    
    public PlaylistTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
    @Test
    public void createPlaylistTest() {
        Playlist myPlaylist = new Playlist("Name Of List");
        assertEquals("Name Of List", myPlaylist.getName());
    }
    
    @Test
    public void addSongTest() {
        Playlist myPlaylist = new Playlist("Name of List");
        myPlaylist.addSong(new Song("Song One", "Artist One"));
        myPlaylist.addSong(new Song("Song Two", "Artist Two"));
        assertEquals(2, myPlaylist.songCount());
    }
    
}
