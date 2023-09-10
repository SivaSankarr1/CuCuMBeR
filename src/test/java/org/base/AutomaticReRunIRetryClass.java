package org.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AutomaticReRunIRetryClass implements IRetryAnalyzer{
   int min=0;
   int max=10;
	public boolean retry(ITestResult result) {
		if(min<=max) {
		min++;
		return true;
		}
		return false;
	}

}
