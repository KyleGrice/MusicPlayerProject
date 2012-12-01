/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.titanPlayer.bll.Playlist;
import com.titanPlayer.bll.PlaylistRepository;
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
public class PlaylistRepositoryTests {
    
    public PlaylistRepositoryTests() {
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
   public void addLibraryTest() {
       PlaylistRepository repo = new PlaylistRepository();
       Playlist userPlaylist = new Playlist("Name of List");
       repo.addPlaylist(userPlaylist);
       assertEquals(1, repo.playlistCount());
   }
   
   @Test
   public void getPlaylistFromRepoTest() {
       PlaylistRepository repo = new PlaylistRepository();
       Playlist userPlaylist = new Playlist("Name of List");
       Playlist fetchedPlaylist = new Playlist(" ");
       repo.addPlaylist(userPlaylist);
       
       if (repo.playlistExists("Name of List")) {
           fetchedPlaylist = repo.getPlaylist("Name of List");
       }
       
       assertEquals(userPlaylist, fetchedPlaylist);
   }
}
