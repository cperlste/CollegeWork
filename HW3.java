import java.util.Scanner;
import java.io.*;
public class HW3 {
public static void main(String[]args)throws IOException{
	//create a new file scanner for the numbers.txt file
	File file = new File ("numbers.txt");
	Scanner fileScan = new Scanner(file);
	//if the file does not exist, display an error message
	if (!file.exists()){
		System.out.println("The file that you have requested does not exist.");
		System.exit(1);
	}
	//find the first number in the list
	int currentNumber=fileScan.nextInt();
	//set that number as the biggest, smallest, and the first number in the sum
	int largeNum= currentNumber;
	int smallNum=currentNumber;
	int sumAll=currentNumber;
	//initialize the number count to 1
	int amtAll=1;
	//set up a loop that iterates through all of the numbers in the file
	while (fileScan.hasNextInt()){
	//call the largeNum and smallNum functions and save the returned data as variables
	largeNum= largestNum(currentNumber,largeNum);
	smallNum= smallestNum(currentNumber,smallNum);
	//proceed to the next number
	currentNumber= fileScan.nextInt();
	//add that number to the total
	sumAll+=currentNumber;
	//add 1 to the count of numbers
	amtAll++;
	}
	//call the average function once the loop is done
	double avgAll= avgCalc(sumAll, amtAll);
	//display the output
	outputFile(largeNum, smallNum, avgAll);
	//close the file scanner
	fileScan.close();
	System.exit(0);
}
//define the output function based on the data received by the other functions
public static void outputFile(int biggest, int smallest, double avg)throws IOException{
	//create a print writer to output the data to a file
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Type a name for the file that will display the output. Please include the file extension");
	String fileName=keyboard.next();
	PrintWriter output = new PrintWriter(fileName);
	output.println("The largest number is: "+ biggest);
	output.println("The smallest number is: "+smallest);
	output.printf("The average is: %.2f",avg);
	System.out.println("Your data has been written to the "+fileName+" file");
	//close the printWriter
	output.close();
}
//define the function to find the largest number
public static int largestNum(int currentNum,int bigNum)throws IOException{
		//given a number, check to see if it is larger than the current big number
		if (currentNum>=bigNum){
			return currentNum;
		}
	return bigNum;
}
public static int smallestNum(int currentNum, int lilNum)throws IOException{
		//check if the current number is smaller than the set smallest number
		if (currentNum<=lilNum){
			return currentNum;
		}
	return lilNum;
}
public static double avgCalc(int sum, int amt){
	//calculate and return the average
	return (double) sum/amt;
}
}

