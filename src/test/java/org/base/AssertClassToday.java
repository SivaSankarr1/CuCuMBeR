package org.base;

import org.junit.Assert;
import org.junit.Test;

public class AssertClassToday {
	
@Test
public void tc01() {
	String s = "Jack";
	System.out.println("Test");
	boolean contains = s.contains("j");
	Assert.assertTrue(contains);
	System.out.println(contains);
}
@Test
public void tc02() {
	String s = "Jack";
	System.out.println("Test1");
	boolean contains = s.contains("J");
	Assert.assertFalse(contains);
	System.out.println(contains);	
}
@Test
public void tc03() {
	String s = "Jack";
	System.out.println("Test2");
	boolean contains = s.contains("J");
	Assert.assertEquals(false, contains);
	System.out.println(contains);	
}


}
