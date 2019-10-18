import java.util.*;
import java.io.*;
public class HW7 {
public static void main(String[]args){
	Scanner keyboard= new Scanner(System.in);
	System.out.println("Which file would you like to read? Please include the file extension.");
	String fileName= keyboard.nextLine();
	try{
		//set up the file and scanner to read from the text file
		File file= new File(fileName);
		Scanner fileScan= new Scanner(file);
		//instantiate the list of scores based on the amount of students
		int numStudents= fileScan.nextInt();
		ArrayList<Integer> scoreList= new ArrayList<Integer>(numStudents);
		//instantiate a list of students names based on the amount of students
		ArrayList<String> nameList= new ArrayList<String>(numStudents);
		//fill both arrays
		for(int x=0;x<numStudents;x++){
			scoreList.add(x, fileScan.nextInt());
			//clear the buffer
			fileScan.nextLine();
			nameList.add(x, fileScan.nextLine());
		}
		//call the bestScore function
		int best= bestScore(scoreList);
		//initialize the total
		int total=0;
		//for each item in the list, calculate and receive the letter grade
		for(int x=0;x<numStudents;x++){
			int yourScore= scoreList.get(x);
			String studentName= nameList.get(x);
			char grade= yourGrade(yourScore, best);
			//display results of the loop
			System.out.printf("%s's score is %d, and his grade is %c.", studentName, yourScore, grade);
			System.out.println();
			//add the current score to the total
			total+=yourScore;
		}
		//call the method to display the results
		displayInfo(scoreList, nameList);
		//call the method to calculate the class average
		double classAvg= calculateAverage(total, numStudents);
		//display the average
		System.out.printf("Class Average: %.2f", classAvg);
		System.out.println();
		//display the best score
		System.out.println("Best Score: "+best);
		//calculate and display the amt of students that scored over/below the average
		int amtOver= amtAbove(scoreList, classAvg);
		System.out.printf("\n %d students scored above or equal to the class average.", amtOver);
		int amtUnder= amtBelow(scoreList, classAvg);
		System.out.printf("\n %d studens scored below the class average.", amtUnder);
		//close the scanners
		keyboard.close();
		fileScan.close();
		//end the program
		System.exit(0);
	//catch any exceptions
	}catch(FileNotFoundException e){
		System.out.println("Error. The file that you requested was not found.");
		System.exit(1);
	}catch(InputMismatchException e){
		System.out.println("An error occured with the input you attempted to receive");
		System.exit(1);
	}
}
/**
 * this method loops through the list of scores to find the highest one
 * @param scores //the list to search 
 * @return //the best score
 */
public static int bestScore(ArrayList<Integer>scores){
	int bestScore= scores.get(0);
	for(int x=1; x<scores.size();x++){
		if(scores.get(x)>bestScore){
			bestScore= scores.get(x);
		}
	}
	return bestScore;
}
public static char yourGrade(int currentGrade, int bestGrade){
	if (currentGrade>=bestGrade-10){
		return 'A';
	}
	else if(currentGrade>=bestGrade-20){
		return 'B';
	}
	else if(currentGrade>=bestGrade-30){
		return 'C';
	}
	else if(currentGrade>=bestGrade-40){
		return 'D';
	}
	else{
		return 'F';
	}
}
public static void displayInfo(ArrayList<Integer> listScores, ArrayList<String>listNames){
	for(int x=0; x<listScores.size(); x++){
		System.out.println(listNames.get(x)+": "+ listScores.get(x));
	}
}
public static double calculateAverage(int sumScores, int amtStudents){
	return(double)sumScores/amtStudents;
}
public static int amtAbove(ArrayList<Integer>listScores, double avg){
	int numOver=0;
	for(int x=0; x<listScores.size(); x++){
		if(listScores.get(x)>=avg){
			numOver++;
		}
	}
	return numOver;
}
public static int amtBelow(ArrayList<Integer>listScores, double avg){
	int numUnder=0;
	for (int x=0; x<listScores.size(); x++){
		if(listScores.get(x)<avg){
			numUnder++;
		}
	}
	return numUnder;
}
}
