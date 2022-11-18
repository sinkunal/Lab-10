package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		UnitFunctions junitstring = new UnitFunctions();
		String result = junitstring.addString("capstone", "project");
		assertEquals("capstoneproject", result);
		
	}

}
