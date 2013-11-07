package francisco;

import java.io.IOException;

public class TestAsserts extends Tests {

	public TestAsserts(String nameTestSUite) throws IOException {
		report = new Reporter("TestAsserts");
	}

	public void testAssertTrueWhenTrue() {
		assertTrue(4 > 3,"testAssertTrueWhenTrue");
	}
	
	public void testAssertTrueWhenFalse() {
		assertTrue(4 < 3,"testAssertTrueWhenTrue");
	}
	
	public void testAssertFalseWhenFalse() {
		assertFalse(4 < 3,"testAssertTrueWhenTrue");
	}
	
	public void testAssertFalseWhenTrue() {
		assertFalse(4 > 3,"testAssertTrueWhenTrue");
	}
	
	public void run() {
		testAssertTrueWhenTrue();
		testAssertTrueWhenFalse();
		testAssertFalseWhenFalse();
		testAssertFalseWhenTrue();
	}

}
