package org.base;
import org.testng.annotations.Test;
public class ProgramForGroupsUsingTestNG {
@Test(groups="Sanity",dependsOnMethods="tco9")
private void tco1() {
System.out.println("Sanity:Test1");	
}
@Test(groups="Smoke")
private void tco2() {
System.out.println("Smoke:Test2");	
}	
@Test(groups="Sanity")
private void tco3() {
System.out.println("Sanity:Test3");	
}
@Test(groups="Sanity")
private void tco4() {
System.out.println("Sanity:Test4");	
}
@Test(groups="Regg")
private void tco5() {
System.out.println("Regg:Test5");	
}
@Test(groups="Sanity")
private void tco6() {
System.out.println("Sanity:Test6");	
}
@Test(groups="Smoke")
private void tco7() {
System.out.println("Smoke:Test7");	
}
@Test(groups="Smoke")
private void tco8() {
System.out.println("Smoke:Test8");	
}
@Test(groups="Regg")
private void tco9() {
System.out.println("Regg:Test9");	
}
@Test(groups="Regg")
private void tc10() {
System.out.println("Regg:Test10");	
}
}
