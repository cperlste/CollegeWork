import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class HW4Part2 {
public static void main(String[]args)throws IOException{
	System.out.println("Which file would you like to read? Please include the file extension.");
	Scanner keyboard= new Scanner(System.in);
	String fileName=keyboard.nextLine();
		try{
		//set up the file and scanner to read from the text file
		File file= new File (fileName);
		Scanner fileScan= new Scanner(file);
		//instantiate the list of scores based on the amount of students
		int numStudents= fileScan.nextInt();
		int [] scoreList= new int [numStudents];
		//instantiate a list of students names based on the amount of students
		String [] nameList= new String[numStudents];
		//fill both arrays
		for (int x=0; x<numStudents; x++){
			scoreList[x]= fileScan.nextInt();
			//clear the buffer
			fileScan.nextLine();
			nameList[x]=fileScan.nextLine();
		}
		//call the bestScore function
		int best= bestScore(scoreList);
		//initialize the total variable
		int total=0;
		//for each item in the list, calculate and receive the letter grade
		for (int x=0;x<numStudents;x++){
			int yourScore= scoreList[x];
			String studentName= nameList[x];
			char grade=yourGrade(yourScore,best);
			System.out.println();
			//display results for each student 
			System.out.println(studentName+ "'s score is "+yourScore+" and his grade is "+grade);
			//add the current score to the total
			total+=yourScore;
		}
		//display the scores for each student
		displayInfo(scoreList, nameList);
		//when the loop ends, calculate the class average
		double classAvg= calculateAverage(total, numStudents);
		System.out.printf("Class Average: %.2f",classAvg);
		System.out.println();
		//display the best score
		System.out.println("Best Score: "+best);
		//calculate and display the amt of students that scored over/below the average
		int amtOver= amtAbove(scoreList, classAvg);
		System.out.printf("\n"+amtOver+ " students scored above or equal to the class average");
		int amtUnder = amtBelow(scoreList, classAvg);
		System.out.printf("\n"+amtUnder+ " students scored below the class average");
		//close the Scanners
		keyboard.close();
		fileScan.close();
		//end the program
		System.exit(0);
		//catch the exception that would occur should the file not be found
		}catch(FileNotFoundException e){
			System.out.println("Error. The file that you have requested was not found.");
			System.exit(1);
		//catch that exception that would occur should something go wrong with the input
		}catch(InputMismatchException e){
			System.out.println("An error occured with the input that you attempted to receive.");
			System.exit(1);
		}
	}
	//this method will find the best score from the list of grades
	public static int bestScore(int []scores){
		int bestScore= scores[0];
		//iterate through the list to find the highest score
		for (int x=1; x<scores.length; x++){
			if (scores[x]>bestScore){
				bestScore=scores[x];
			}
		}
		return bestScore;
	}
	//this method will calculate the letter grade in relation to the highest grade
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
	//this method will display the information about every student
	public static void displayInfo(int[] listScores, String[] listNames){
	for(int x=0; x<listScores.length; x++){
		System.out.println(listNames[x]+ ": "+ listScores[x]);
	}
	}
	//this method calculates and returns the average score in the class
	public static double calculateAverage(int sumScores, int amtStudents){
		return (double) sumScores/amtStudents;
	}
	//this method calculates and returns the amount of scores greater than or equal to the average score
	public static int amtAbove(int[] listScores, double avg){
		int numOver=0;
		for (int x=0; x<listScores.length; x++){
			if (listScores[x]>=avg){
				numOver++;
			}
		}
		return numOver;
	}
	//this method calculates and returns the amount of scores less than the class average
	public static int amtBelow(int[] listScores, double avg){
		int numUnder=0;
		for (int x=0; x<listScores.length; x++){
			if (listScores[x]<avg){
				numUnder++;
			}
		}
		return numUnder;
	}
}

