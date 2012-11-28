/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.titanPlayer.bll.MusicPlayer;
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
public class MusicPlayerTests {
    
    public MusicPlayerTests() {
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
    public void skipSongTest() {
        MusicPlayer myPlayer = new MusicPlayer();
        myPlayer.skipSong();
        assertEquals(1, myPlayer.getCurrentSongIndex());
    }
    
    @Test
    public void stopSong() {
        MusicPlayer myPlayer = new MusicPlayer();
        myPlayer.stopSong();
        assertEquals(false, myPlayer.getPlayingStatus());
    }
    
}
