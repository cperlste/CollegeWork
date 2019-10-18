//Chaya Perlstein
package assn01;

import static org.junit.Assert.*;
import org.junit.*;

public class Searching_TESTS {
	@Test
	public void ItemThatIsntPresentGivesNegativeOne() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(-1, Searching.findElem(arr, 12));
	}
	
	@Test
	public void FirstItemIsFound() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(0, Searching.findElem(arr, 1));	
	}
	
	@Test
	public void LastItemIsFound() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(arr.length - 1, Searching.findElem(arr, 5));	
	}
	
	@Test
	public void ItemIsFoundInArrayOfSizeOne() {
		int[] arr = {1};
		assertEquals(0, Searching.findElem(arr, 1));
	}
	
	@Test
	public void MiddleOfOddSizedArrayIsFound() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(2, Searching.findElem(arr, 3));
	}
	
	@Test
	public void FirstMiddleOfEvenSizedArrayIsFound() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		assertEquals(3, Searching.findElem(arr, 4));
	}
	
	@Test
	public void SecondMiddleOfEvenSizedArrayIsFound() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		assertEquals(4, Searching.findElem(arr, 5));
	}
	
	static int [] longarr = new int[250000000];
	
	/*
	@Test (timeout=75)
	public void LongArrayIsSearchedQuickly() {
		assertEquals(-1, Searching.findElem(longarr, 1));
	}
	*/
}
