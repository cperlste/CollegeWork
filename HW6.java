import java.util.*;
public class HW6 {
public static void main(String[]args){
	System.out.println("Welcome! This program will test numbers to see if they form a Lo Shu Magic Square.");
	//set a variable to repeat the loop
	String repeat;
	do{
	//instantiate a double array for the square
	int [][] magicSquare= new int[3][3];
	Scanner keyboard= new Scanner(System.in);
	//call the fillArray method
	fillArray(keyboard, magicSquare);
	//check the array for repetition
	Boolean check=checkRepetition(magicSquare);
	if(check==true){
		//add each row, column, and diagonal
		int sumRow0= sumRow(0, magicSquare);
		int sumRow1=sumRow(1,magicSquare);
		int sumRow2=sumRow(2,magicSquare);
		int sumColumn0=sumColumn(0, magicSquare);
		int sumColumn1=sumColumn(1, magicSquare);
		int sumColumn2=sumColumn(2, magicSquare);
		int sumDiagDown= sumDiagDown(magicSquare);
		int sumDiagUp= 	magicSquare[2][0]+magicSquare[1][1]+magicSquare[0][2];
		//display the square
		displayArray(magicSquare);
		//display the results of the square test
		if(sumRow0==sumRow1 && sumRow0==sumRow2 && 
				sumRow0==sumColumn0 && sumRow0==sumColumn1 && 
				sumRow0==sumColumn2 && sumRow0==sumDiagUp && sumRow0==sumDiagDown)
		{
			System.out.println("You have produced a magic square!");
		}else{
			System.out.println("That is not a magic square.");
		}
	}
	//clear the newline
	keyboard.nextLine();
	//ask the user if he/she would like to repeat
	System.out.println("Would you like to test another square?");
	repeat= keyboard.nextLine();
	}while(repeat.equalsIgnoreCase("YES"));
	//display a closing message and exit the program 
	System.out.println("Thank you for playing! Have a great day!");
	System.exit(0);
}
/**
 * this method fills the array 
 * @param keyboard	//to scan the input
 * @param square	//the array to fill
 */
public static void fillArray(Scanner keyboard, int [][]square){
	//loop through each row and column
	for(int x=0; x<square.length; x++){
		for(int y=0; y<square[x].length;y++){
		//receive input to fill the array
		System.out.println("Enter a number between 1 and 9 for position ["+x+"]["+ y+"]. Do not repeat numbers.");
		square[x][y]= keyboard.nextInt();
		//validate an input between 1 and 9
		if(square[x][y]<1 | square[x][y]>9){
			square[x][y]=checkNums(keyboard, square[x][y]);
		}
		}
	}
}
/**
 * this method validates the user input. If the input does not comply the rules, the user
 * @param keyboard	//to scan the input
 * @param value	// the value of the incorrect input that will be fixed
 * @return the corrected value
 */
public static int checkNums(Scanner keyboard, int value){
	do{
		System.out.println("You must enter a number between 1 and 9. Please enter another number");
		value= keyboard.nextInt();
	}while(value<1 | value>9);
	return value;
}
/**
 * this method checks that the array does not contain any repeated values
 * @param square	//the 2D array
 * @return false if the array contains a repeated value. return true if the array contains different values
 */
public static Boolean checkRepetition(int[][]square){
	//create a one-dimensional array from the 2D array
	int[]square1D= new int[9];
	for(int row=0;row<square.length;row++){
		for(int col=0;col<square[row].length;col++){
			square1D[(row*square.length)+col]=square[row][col];
		}
	}
	//create a loop that iterates through the rest of the array and compares it to the current pointer
	for(int y=0; y<square1D.length; y++){
		for(int i=y+1; i<square1D.length; i++){
			if(i!=y && square1D[i]==square1D[y]){
				System.out.println("You have a repeated value of "+square1D[y]+". You may not repeat"
						+ " numbers, so we cannot test this square.");
				return false;	
			}
		}
	}return true;
}
/**
 * this method adds the values of the numbers in the row
 * @param rowName	//the row to sum
 * @param magicSquare	//the array 
 * @return the sum of the row
 */
public static int sumRow(int rowName, int[][]magicSquare){
	int total=0;
	for(int x=0;x<magicSquare[rowName].length;x++){
		total+=magicSquare[rowName][x];
	}return total;
}
/**
 * this method adds the values of the numbers in the column
 * @param columnName	//the row to sum
 * @param magicSquare	//the array
 * @return	the sum of the column
 */
public static int sumColumn(int columnName, int[][]magicSquare){
	int total=0;
	for(int x=0;x<magicSquare.length;x++){
		total+=magicSquare[x][columnName];
	}
	return total;
}
/**
 * this method adds the values of the diagonal that begins at array[0][0]
 * @param magicSquare	//the array
 * @return the sum of the diagonal
 */
public static int sumDiagDown(int[][]magicSquare){
	int total=0;
	for(int x=0; x<magicSquare.length; x++){
		total+=magicSquare[x][x];
	}return total;
}
/**
 * this method displays the contents of the array
 * @param square	//the array to display
 */
public static void displayArray(int[][]square){
	for(int x=0; x<square.length; x++){
		for(int y=0; y<square[x].length; y++){
			System.out.print(square[x][y]+" ");
		}System.out.println();
	}
}
}
