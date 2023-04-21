package io.abhinandan;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest 
{
	MathUtils mathUtils;
	TestInfo testInfo;
	TestReporter testReport;
	
	@BeforeAll
	public void beforeInstantiation()
	{
		System.out.println("Before Instantiation...");
	}
	
	@BeforeEach
	public void beforeInit(TestInfo testInfo, TestReporter testReport)
	{
		this.testInfo = testInfo;
		this.testReport=testReport;
		mathUtils = new MathUtils();
		System.out.println("Before testing each method:");
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("cleaning up...");
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Add method")
	public void testAdd()
	{
		System.out.println(testInfo.getDisplayName()+" "+testInfo.getTags()+ " "+testInfo.getTestMethod());
		assertAll(
				()-> assertEquals(4,mathUtils.add(2, 2),"should return right sum"),
				()->assertEquals(6, mathUtils.add(3, 3),"should return rigth sum")
				);
	}
	
	@Test
	@DisplayName("Subtract Method")
	@Tag("Math")
	public void testSubtract()
	{
		System.out.println(testInfo.getDisplayName()+" "+testInfo.getTags()+ " "+testInfo.getTestMethod());
		assertAll(
				()-> assertEquals(2, mathUtils.subtract(6, 4)),
				()-> assertEquals(-12, mathUtils.subtract(-8, 4))
				);
	}
	
	@Nested
	@DisplayName("Divide methods")
	@Tag("Math")
	class DivideTest
	{
		@Test
		public void divideTest()
		{
			System.out.println(testInfo.getDisplayName()+" "+testInfo.getTags()+ " "+testInfo.getTestMethod());
			assertEquals(2, mathUtils.divide(4, 2));
		}
		@Test
		public void divideError()
		{
			System.out.println(testInfo.getDisplayName()+" "+testInfo.getTags()+ " "+testInfo.getTestMethod());
			assertThrows(ArithmeticException.class,()-> mathUtils.divide(4, 0));
		}
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Multiply method")
	public void testMultiply()
	{
		System.out.println(testInfo.getDisplayName()+" "+testInfo.getTags()+ " "+testInfo.getTestMethod());
		assertAll(
				()-> assertEquals(100, mathUtils.multiply(10, 10)),
				()-> assertEquals(50, mathUtils.multiply(25, 2))
				);
	}
	
	@Test
	@Tag("Arrays")
	@DisplayName("Arrays Method")
	public void testArrays()
	{
		System.out.println(testInfo.getDisplayName()+" "+testInfo.getTags()+ " "+testInfo.getTestMethod());
		int arr[]= {1,2,3,4};
		assertArrayEquals(arr, mathUtils.array());
	}
	
	@Test
	@DisplayName("Rectangle Area")
	@Tag("Rectangle")
	public void testRectangleArea()
	{
		System.out.println(testInfo.getDisplayName()+" "+testInfo.getTags()+ " "+testInfo.getTestMethod());
		assertEquals(100, mathUtils.computerRectangleArea(50, 2));
	}
	
	@AfterAll
	public void afterAll()
	{
		System.out.println("Test ending...");
	}
}
