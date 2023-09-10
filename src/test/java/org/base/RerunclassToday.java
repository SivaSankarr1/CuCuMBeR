package org.base;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RerunclassToday {
@Test(retryAnalyzer=AutomaticReRunIRetryClass.class)
private void Tc01() {
String s ="Jack";
System.out.println("Test1");
Assert.assertTrue(false);
System.out.println(s);
}
@Test
private void tc02() {
	System.out.println("End programme");
}
}
