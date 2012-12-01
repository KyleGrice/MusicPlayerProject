/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.titanPlayer.bll.Library;
import com.titanPlayer.bll.MP3Filter;
import com.titanPlayer.bll.Song;
import com.titanPlayer.bll.UserAccount;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
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
public class LibraryTests {
    
    public LibraryTests() {
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
    public void emptyLibraryTest() {
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.songCount());
    }
    
    @Test
    public void addSongTest() {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Song One", "Artist One"));
        myLibrary.addSong(new Song("Song Two", "Artist Two"));
        assertEquals(2, myLibrary.songCount());
    }
    
    @Test
    public void removeSongTest() {
        Library removeSongLibrary = new Library();
        Song song1 = new Song("Song One", "Artist One");
        Song song2 = new Song("Song Two", "Artist Two");
        removeSongLibrary.addSong(song1);
        removeSongLibrary.addSong(song2);
        removeSongLibrary.removeSong(song1);
        assertEquals(1, removeSongLibrary.songCount());
    }
    
    @Test
    public void sortByTest() {
        Library sortLibrary = new Library();
        sortLibrary.addSong(new Song("Second", "First"));
        sortLibrary.addSong(new Song("First", "Second"));
        
        sortLibrary.sortByTitle();
        assertEquals("First", sortLibrary.getSong(0).getTitle());
        assertEquals("Second", sortLibrary.getSong(0).getArtist());
        
        sortLibrary.sortByArtist();
        assertEquals("First", sortLibrary.getSong(0).getArtist());
        assertEquals("Second", sortLibrary.getSong(0).getTitle());
    }
    
}
