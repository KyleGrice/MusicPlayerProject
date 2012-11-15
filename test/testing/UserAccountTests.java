/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

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
public class UserAccountTests {
    
    public UserAccountTests() {
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
    public void validateUserAccountTest() {
        UserAccount user1 = new UserAccount("Kyle", "a1!", "kylejgrice@gmail.com");
        assertEquals(true, user1.ValidAccount());              
    }
}
