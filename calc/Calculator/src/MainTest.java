import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class MainTest {

	@Test
	 public void testadd() {
		int expected = Main.add(4, 3);
	    assertEquals(7, expected);
	    assertTrue(Main.add(7, 3) == 10);
	 }
}
