package org.base;

import org.testng.annotations.Test;

public class TestRunnerClass1 {
@Test
	private void test1() {
		System.out.println("Thread-Id"+Thread.currentThread().getId()+"\t"+"TestRunnerClass1-Test1");
	}
@Test
private void test2() {
	System.out.println("Thread-Id"+Thread.currentThread().getId()+"\t"+"TestRunnerClass1-Test2");
}	
@Test
private void test3() {
	System.out.println("Thread-Id"+Thread.currentThread().getId()+"\t"+"TestRunnerClass1-Test3");
}
@Test
private void test4() {
	System.out.println("Thread-Id"+Thread.currentThread().getId()+"\t"+"TestRunnerClass1-Test4");
}

@Test
private void test5() {
	System.out.println("Thread-Id"+Thread.currentThread().getId()+"\t"+"TestRunnerClass1-Test5");
}


}
