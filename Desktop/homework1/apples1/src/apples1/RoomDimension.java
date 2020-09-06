package apples1;
import java.util.Scanner;

public class RoomDimension {

	public double getArea(double length, double width) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in the length here: ");
		
		length = input.nextDouble();
		
		System.out.println("Enter in the width here: ");
		
		width = input.nextDouble();
		
		return length * width;
		
	}
	
}



