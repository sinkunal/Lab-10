package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
	UnitFunctions junit = new UnitFunctions();
	int result = junit .addNumber(100, 200);
	assertEquals (300, result);
	
	
	}

}
