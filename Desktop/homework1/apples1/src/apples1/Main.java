package apples1;

import java.util.Scanner;

public class Main {
	
public static void main(String args[]) {
	
	double length = 0;
	double width = 0;
	
	RoomDimension obj1 = new RoomDimension();
	
	System.out.println("The total area of carpet is " + obj1.getArea(length, width));
	
}
}
