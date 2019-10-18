import javax.swing.JOptionPane;
public class HW1 {
public static void main(String[]args){
	//define the variables' data types
	String floors;
	int intFloors;
	int x;
	String roomsOnFloor;
	int intRoomsOnFloor;
	String roomsOccupied;
	int intRoomsOccupied;
	int totalRooms=0;
	int totalRoomsOccupied=0;
	int vacant=0;
	double occRate;
	System.out.println("Welcome! This program will calculate the occupancy rate of a hotel");
	//get total floors using the JOptionPane
	floors= JOptionPane.showInputDialog("How many floors are there in the hotel?");
	//convert the string input to an integer
	intFloors= Integer.parseInt(floors);
	//validate that there is at least one floor
	while (intFloors<1){
		floors= JOptionPane.showInputDialog("Please input a number that is greater than 1");
		intFloors = Integer.parseInt(floors);
	}
	//set up a loop that iterates through each floor
	for(x=1;x<=intFloors;x++){
		//prompt the user to input a number of floors and convert that string to an integer
		roomsOnFloor= JOptionPane.showInputDialog("How many rooms are there on floor "+x+"?");
		intRoomsOnFloor= Integer.parseInt(roomsOnFloor);
		//validate that the user submitted a value that is at least 10
		while (intRoomsOnFloor<10){
		roomsOnFloor= JOptionPane.showInputDialog("There must be at least 10 rooms per floor. Please input another amount of rooms.");
		intRoomsOnFloor=Integer.parseInt(roomsOnFloor);
		}
		//get the amount of occupied rooms and convert the string to an integer
		roomsOccupied= JOptionPane.showInputDialog("Of the" + intRoomsOnFloor+ " rooms on floor #"+ x+", how many are occupied?");
		intRoomsOccupied= Integer.parseInt(roomsOccupied);
		//validate a logical input
		while (intRoomsOccupied>intRoomsOnFloor){
			roomsOccupied= JOptionPane.showInputDialog("Please input a value that is less than or equal to " + intRoomsOnFloor+"\nOf the" + intRoomsOnFloor+ " rooms on floor #"+ x+", how many are occupied?");
			intRoomsOccupied= Integer.parseInt(roomsOccupied);
		}
		//add the amount of rooms on this floor to the total 
		totalRooms+=intRoomsOnFloor;
		//add the amount of occupied rooms to the total
		totalRoomsOccupied+=intRoomsOccupied;
		//calculate the amount of vacant rooms and add it to the total
		vacant+= (intRoomsOnFloor-intRoomsOccupied);		
	}
	//when the loop is over, calculate the occupancy rate
	occRate = totalRoomsOccupied / totalRooms;
	//display results
	JOptionPane.showMessageDialog(null, "Amount Of Rooms: " + totalRooms+ "\nRooms Occupied: "+ totalRoomsOccupied+ "\nRooms Vacant: "+ vacant+"\nOccupancy Rate: "+ occRate);
	//exit the program
	System.exit(0);
}
}
