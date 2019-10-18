//Chaya Perlstein
package assn01;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;
public class arrays_TESTS {
 
	//This test will ascertain that the getSum method returns the sum total of the elements
	@Test
	public void getSumReturnsTotal() {
		int[] array= {1,2,3,4,5};
		assertEquals(15, arrays.getSum(array));
	}
	
	//verify that the getSum method can calculate the total of an array with one element
	@Test
	public void getSumReturnsSumOfArrayWithOneElement() {
		int[]array= {7};
		assertEquals(7, arrays.getSum(array));
	}
	
	//make sure that an empty array will result in a sum of 0
	@Test 
	public void getSumReturnsZeroForEmptyArray() {
		int[]array= {};
		assertEquals(0, arrays.getSum(array));
	}
	
	//verify that getMax can find the max from an unordered array
	@Test
	public void getMaxReturnsMaxOfUnorderedList() {
		int[]array= {1,4,5,18, 3,2,7,-5};
		assertEquals(18, arrays.getMax(array));
	}
	
	//verify that getMax can find the max from an ordered array
	@Test
	public void getMaxFindMaxOfOrderedList() {
		int[]array= {6,7,8,9,10};
		assertEquals(10, arrays.getMax(array));
	}
	
	//verify that getMax can find the max of an array that has a repeated max
	@Test
	public void getMaxOfArrayWithRepeatedMax() {
		int[]array= {24, 24, 23};
		assertEquals(24, arrays.getMax(array));
	}
	
	//verify that getMin can find the min from an unordered array
	@Test
	public void getMinOfUnorderedList() {
		int[]array= {1,4,5,18, 3,2,7,-5};
		assertEquals(-5, arrays.getMin(array));
	}
	
	//verify that getMin can find the min from an ordered array
	@Test
	public void getMinOfOrderedList() {
		int[]array= {6,7,8,9,10};
		assertEquals(6, arrays.getMin(array));
	}
	
	//verify that getMin can find the min of an array that has a repeated min
	@Test
	public void getMinOfArrayWithRepeatedMin() {
		int[]array= {9, 8, 2, 2, 7};
		assertEquals(2, arrays.getMin(array));
	}
	
	//verify that getRange can find the range from an ordered array
	@Test
	public void getRangeOfOrderedList() {
		int[]array= {2,4,5,8,12};
		assertEquals(11, arrays.getRange(array));
	}
	
	//verify that getRange can find the range from an unordered array
	@Test
	public void getRangeOfUnorderedList() {
		int[] array ={2, 15, 3, 4, 6, 18, 9};
		assertEquals(17, arrays.getRange(array));
	}
	
	//verify that getRange can find the range from an array with positive and negative values
	@Test
	public void getRangeFromArrayWithPositiveAndNegativeNums() {
		int[] array= {-1, 3, -5, 6, 8 ,10, -2};
		assertEquals(16, arrays.getRange(array));
	}
}
