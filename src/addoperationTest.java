import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class addoperationTest {
	private static addoperation addoperation = new addoperation();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAquare() {
		addoperation.aquare(9);
		assertEquals(81, addoperation.getResult());
	}

}
