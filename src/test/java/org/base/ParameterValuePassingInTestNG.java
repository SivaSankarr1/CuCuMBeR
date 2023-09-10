package org.base;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterValuePassingInTestNG {
@Parameters({"username"})
@Test
private void test1(String username) {
	System.out.println(username);
}

	
}
