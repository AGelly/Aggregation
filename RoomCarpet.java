
public class RoomCarpet {

	// Instance Fields
	private RoomDimension size;
	private double carpetCost; 
	
	public RoomCarpet(RoomDimension dim, double cost)
	{
		size = dim;
		carpetCost = cost;
	}
	
	public double getTotalCost()
	{
		return size.getArea() * carpetCost;
	}
	
	public String toString()
	{
		return "The area is " + size.getArea() + " The carpet cost per square foot " +
				carpetCost;
	}
}
