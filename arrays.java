//Chaya Perlstein
package assn01;

public class arrays {
	public static int getSum(int[]array) {
		int total=0;
		for (int x=0; x<array.length; x++) {
			total+=array[x];
		}
		return total;
	}
	public static int getMax(int[]array) {
		int max= array[0];
		for (int x=1; x<array.length; x++) {
			if(array[x]>=max) {
				max=array[x];
			}
		}
		return max;
	}
	public static int getMin(int[]array) {
		int min= array[0];
		for(int x=1; x<array.length; x++) {
			if(array[x]<=min) {
				min=array[x];
			}
		}
		return min;
	}
	public static int getRange(int[]array) {
		int max= arrays.getMax(array);
		int min= arrays.getMin(array);
		return max-min+1;
	}

}
