/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import com.titanPlayer.bll.Library;
import com.titanPlayer.bll.LibraryRepository;
import com.titanPlayer.bll.UserAccount;
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
public class LibraryRepositoryTests {
    
    public LibraryRepositoryTests() {
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
        LibraryRepository repo = new LibraryRepository();
        Library userLibrary = new Library();
        repo.addLibrary(userLibrary);
        assertEquals(1, repo.libraryCount());
    }
    
    @Test
    public void getUserLibraryTest() {
        LibraryRepository repo = new LibraryRepository();
        Library userLibrary = new Library();
        UserAccount user = new UserAccount("Kyle", "asd123!", "email@here.now");
        
        userLibrary.assignUser(user);
        repo.addLibrary(userLibrary);
        
        assertEquals(userLibrary, repo.getUserLibrary(user));
    }
    
}
