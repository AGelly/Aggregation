import java.util.Scanner;

public class CarpetDriver 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the width of the room?");
		double w = keyboard.nextDouble();
		
		System.out.println("What is the length of the room?");
		double l = keyboard.nextDouble();
		
		RoomDimension rd1 = new RoomDimension(l, w);
		
		System.out.println("What is the carpet cost per sq ft?");
		double cost = keyboard.nextDouble();
		
		RoomCarpet rc1 = new RoomCarpet(rd1, cost);
		
		System.out.println(rc1.toString());
		System.out.println("The total cost is " + rc1.getTotalCost());
	}

}
