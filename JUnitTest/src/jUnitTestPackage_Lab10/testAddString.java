package jUnitTestPackage_Lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		jUnitTestFunction myObj1 = new jUnitTestFunction();
		String result1 = myObj1.AddStrings("Girendra_","Sinsinwar");
		String result2 = myObj1.AddStrings("Siddhak_","Dak");

		assertEquals("Girendra_Sinsinwar",result1);
		assertEquals("Siddhak_Dak",result2);

	}

}
