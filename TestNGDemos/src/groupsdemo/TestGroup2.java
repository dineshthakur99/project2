package groupsdemo;

import org.testng.annotations.Test;

public class TestGroup2 {
	
	@Test(groups = {"regression"})
	public void Test5() {
		System.out.println("My second regression test case");
		
	}
	
	@Test(groups = {"regression"})
	public void Test6() {
		System.out.println("My  third regression test case");
		
	}
	
	@Test(groups = {"regression"})
	public void Test7() {
		System.out.println("My fourth regression test case");
		
	}

	@Test(groups = {"smoke"})
	public void Test8() {
		System.out.println("My fourth smoke test case");
		
	}
}
