import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlaceManyInts() {
    int[] input1 = {0,1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1,0}, input1);
  }

  @Test
  public void testReversedTwoInts() {
    int[] input1 = {55,91};
    assertArrayEquals(new int[]{91,55}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest(){
    double[] arr = new double[]{1,2,3,1,4};
    
    assertEquals(3, ArrayExamples.averageWithoutLowest(arr),0.01);
  }
}

