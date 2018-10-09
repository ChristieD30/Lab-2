import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		//open the scanner for input from user 
		Scanner input = new Scanner(System.in);
		//call variables for the measurements and for char
		double roomLength = 0;
		double roomWidth = 0;
		double roomArea = 0;
		double roomPerimeter = 0;
		double roomVolume = 0.0;
		double roomHeight;
		char yesNo;
		
		//Welcomes the user and starts the program
		System.out.println("Hello and welcome to the Grand Circus' Room Detail Generator");

		//do while loop to continue if the user presses Y
		do {

			System.out.println("Please enter the length of the room.");
			roomLength = input.nextDouble();

			System.out.println("Please enter the width of the room.");
			roomWidth = input.nextDouble();

			System.out.println("Please enter the height of the room.");
			roomHeight = input.nextDouble();

			// clears out the scanner to go from double/int to char
			input.nextLine();

			//Mathematical formula for Area = Width * length
			roomArea = roomWidth * roomLength;
			
			//formula for Perimeter = 2(w*l)
			roomPerimeter = 2 * (roomLength + roomWidth);
			
			//formula for volume = L*w*h
			roomVolume = roomHeight * roomWidth * roomLength;

			//code that prints out the results
			System.out.println("The area of the room is " + roomArea);
			System.out.println("The perimeter of the room is " + roomPerimeter);
			System.out.println("The volume of the room is " + roomVolume);

			//prompt user to see if they have more measurements for other rooms
			System.out.println("Do you wish to measure another room? Press Y to start over, or N to quit.");

			//scanner for the character for Y or N
			yesNo = input.next().charAt(0);

		} while (yesNo == 'y' || yesNo == 'Y');

		//close scanner
		input.close();
	}

}
