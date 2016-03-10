import static org.junit.Assert.*;
//need to use static import 

import org.junit.Test;

public class testFizzBuzz {
	
	@Test
	public void TestFizzBuzz() {
		assertEquals(FizzBuzzClass.FizzBuzz(1),"1");
		
	}
	@Test
	public void TestFizzBuzzFor2() {
		assertEquals(FizzBuzzClass.FizzBuzz(2),"2");
		
	}
	@Test
	public void TestFizzBuzzFor3() {
		assertEquals(FizzBuzzClass.FizzBuzz(3),"Fizz");
		
	}
	@Test
	public void TestFizzBuzzFor4() {
		assertEquals(FizzBuzzClass.FizzBuzz(4),"4");
		
	}
	@Test
	public void TestFizzBuzzFor5() {
		assertEquals(FizzBuzzClass.FizzBuzz(5),"Buzz");
		
	}
	@Test
	public void TestFizzBuzzFor6() {
		assertEquals(FizzBuzzClass.FizzBuzz(6),"Fizz");
		
	}
	@Test
	public void TestFizzBuzzFor7() {
		assertEquals(FizzBuzzClass.FizzBuzz(7),"7");
		
	}
	@Test
	public void TestFizzBuzzFor9() {
		assertEquals(FizzBuzzClass.FizzBuzz(9),"Fizz");
		
	}
	@Test
	public void TestFizzBuzzFor10() {
		assertEquals(FizzBuzzClass.FizzBuzz(10),"Buzz");
		
	}
	@Test
	public void TestFizzBuzzFor12() {
		assertEquals(FizzBuzzClass.FizzBuzz(12),"Fizz");
		
	}
	@Test
	public void TestFizzBuzzFor15() {
		assertEquals(FizzBuzzClass.FizzBuzz(15),"FizzBuzz");
		
	}
	@Test
	public void TestFizzBuzzFor30() {
		assertEquals(FizzBuzzClass.FizzBuzz(30),"FizzBuzz");
		
	}
}
