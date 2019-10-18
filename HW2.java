import java.util.Scanner;
import javax.swing.JOptionPane;
public class HW2 {
public static void main(String[]args){
	Scanner keyboard = new Scanner(System.in);
	int accountNumber;
	String input;
	char serviceCode;
	int dayMinutes;
	int nightMinutes;
	input = JOptionPane.showInputDialog("Enter your Account Number");
	accountNumber = Integer.parseInt(input);
	input = JOptionPane.showInputDialog("Enter R for regular and P for premium");
	serviceCode= input.charAt(0);
	double totalBill;
	switch(serviceCode)
	{
	case 'R':
	case 'r':
		input= JOptionPane.showInputDialog("How many minutes did you use this phone for? \nEnter a number greater than or equal to 0");
		dayMinutes = Integer.parseInt(input);
		totalBill = regularBill(dayMinutes);
		nightMinutes = 0;
		displayResults(accountNumber, serviceCode, dayMinutes, nightMinutes, totalBill);
		break;
	case 'P':
	case 'p':
		input= JOptionPane.showInputDialog("How many minutes did you use this phone for in the daytime? \nEnter a number greater than or equal to 0");
		dayMinutes = Integer.parseInt(input);
		input= JOptionPane.showInputDialog("How many minutes did you use this phone for in the nighttime? \nEnter a number greater than or equal to 0");
		nightMinutes = Integer.parseInt(input);
		totalBill = premiumBill(dayMinutes, nightMinutes);
		displayResults(accountNumber, serviceCode, dayMinutes, nightMinutes, totalBill);
		break;
	default:
		input= JOptionPane.showInputDialog("Error. enter the letter R or the letter P");
		serviceCode= input.charAt(0);
	}
	}
public static double regularBill(int amtDay){
	if (amtDay<=50){
		double fee = 10.00;
		return fee;
	}
	else{
		double fee = 10.00+	.2*amtDay;
		return fee; 
	}
}
public static double premiumBill(int amtDay, int amtNight){{
		if (amtNight<=100){
			double feeNight = 25.00;
			if (amtDay<=75){
				double feeDay= 25.00;
				double totalFee= feeNight + feeDay;
				return totalFee;
			}
			else{
				double feeDay= .1*amtDay;
				double totalFee= feeNight + feeDay;
				return totalFee;
			}
		}
		else{
			double feeNight= 25.00+.05*amtNight;
			if (amtDay<=75){
				double feeDay= 25.00;
				double totalFee= feeNight + feeDay;
				return totalFee;
			}
			else{
				double feeDay= .1*amtDay;
				double totalFee= feeNight + feeDay;
				return totalFee;
			}
		}
}
	}
public static void displayResults(int accountNum,char code, int dayMin, int nightMin, double bill){
{
	switch(code){
	case 'R':
	case 'r':
		JOptionPane.showMessageDialog(null, "Account Number: "+ accountNum+ "\nService Type: Regular"+ "\nMinutes Used: " + dayMin+ "\nTotalBill: $"+ bill);
		System.exit(0);
	case 'P':
	case 'p':
		JOptionPane.showMessageDialog(null, "Account Number: "+ accountNum+ "\nService Type: Premium"+ "\nDaytime Minutes Used: " + dayMin+ "\nNightttime Minutes Used: " + nightMin+"\nTotalBill: $"+ bill);
		System.exit(0);
	}
}

}

	
}