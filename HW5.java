import java.io.*;
import java.util.Scanner;
public class HW5 {
public static void main(String[]args)throws IOException{
	//ask the user for the file name to search
	Scanner keyboard= new Scanner(System.in);
	System.out.println("Enter the file that you would like to search. Please include the file extension");
	String fileName=keyboard.nextLine();
	try{
		//set up a scanner to search the file
		File file= new File(fileName);
		Scanner fileScan = new Scanner(file);
		//initialize the amount of elements in the list to 0
		int amtElements=150;
		//instantiate a list based on the amount of elements
		String[] winners= new String[amtElements];
		//calculate how many elements of the list are full
		int count= amtFull(file,fileScan,winners);
		char repeat;
		do{
		//prompt the user to enter the name of a team
		System.out.println("Enter the name of the team that you would like to seach for.");
		System.out.println("Be sure to include the location of the team.");
		String searchTeam= keyboard.nextLine();
		//call the searchArray method
		int amtFound= searchArray(winners, count, searchTeam);
		//display results
		System.out.println("In the past "+ (count+1)+ " years, "+ searchTeam+ " won the World Series "+ amtFound+ " times.");
		//prompt the user to search for another team
		System.out.println("Type Y to search for another team. Type N to stop.");
		String repeatString = keyboard.nextLine().toUpperCase();
		repeat= repeatString.charAt(0);
		}while(repeat=='Y');
		//close the scanners
		keyboard.close();
		fileScan.close();
		//display a farewell message
		System.out.println("Thank you for using our program. Exiting...");
		System.exit(0);
	//catch any exceptions that would occur
	}catch(FileNotFoundException e){
		System.out.println("The file has not been found. Exiting.");
		System.exit(1);
	}catch(NullPointerException e){
		System.out.println("Error. Null Pointer Exception Occured");
		System.exit(1);
	}
}
/**This method searches through a file and counts how many items in the array are full
 * @param Searchfile //the file to be searched
 * @param scanner //the scanner of the file
 * @param teams //the array to be filled
 * @return //the amount of elements in the list that are full
 * @throws IOException
 */
public static int amtFull(File Searchfile, Scanner scanner, String[]teams)throws IOException{
	int amt = 0;
	try{
		for (int x=0; scanner.hasNextLine();x++){
			teams[x]= scanner.nextLine();
			amt++;
		}
	}catch(ArrayIndexOutOfBoundsException y){
		System.out.println("Error. Array Index out of Bounds.");
	}return amt;
}
/**
 * this method searches the list to see how many times an element appears
 * @param teams //list name
 * @param elements //the amount of elements in the list
 * @param searchItem //the item to look for
 * @return
 */
public static int searchArray(String[]teams, int elements, String searchItem){
	int amt=0;
	for(int x=0; x<elements;x++){
		if(teams[x].equals(searchItem)){
			amt++;
		}
	}
	return amt;
}
}
