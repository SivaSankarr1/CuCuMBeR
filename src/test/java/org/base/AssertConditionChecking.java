package org.base;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionChecking {
@Test
private void test01() {
	System.out.println("Test1");
	String s= "Sankar";
	System.out.println(s);
	boolean contains = s.contains("R");
	SoftAssert asrt = new SoftAssert();
	asrt.assertFalse(contains);
	asrt.assertAll();
	System.out.println(contains);
	}
	
}
