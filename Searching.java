//Chaya Perlstein
package assn01;

public class Searching {
	public static int findElem(int[] array, int elem) {
		//index of the first element
		int firstIndex=0;
		//index of the last element
		int lastIndex= array.length-1;
		//index of the found element
		int indexFound=-1;
		//flag to indicate if elem was found
		boolean found= false;

		while(!found && firstIndex<=lastIndex) {
			int midpoint= (firstIndex+lastIndex)/2;
			//if elem is found at the midpoint
			if(array[midpoint]==elem) {
				found=true;
				indexFound=midpoint;
			}
			//if elem is in the lower half of the array, shrink the array to only the lower half
			else if(array[midpoint]> elem){
				lastIndex=midpoint-1;
			}
			//if elem is in the upper half of the array, shrink the array to only the upper half
			else if(array[midpoint]<elem) {
				firstIndex=midpoint+1;
			}
		}
		//return the index of the found element
		//return -1 if the element was not found
		return indexFound;
	}
}
