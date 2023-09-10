package org.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitClassToday{ 
	
@BeforeClass
public static void tc01() {
	System.out.println("test");
}
@Before
public void tc02() {
System.out.println("Test1");

}

@Test
public void tc03() {
System.out.println("Test2");

}

@After
public void tc04() {
System.out.println("Test3");
}

@AfterClass
public static void tc05() {
System.out.println("Test4");

}

}
