
public class ClassDemo
{
	public static void main(String[] args)
	{
		Vehicle boat;
		Vehicle motorcycle;
		Vehicle porsche;

		boat = new Vehicle("boat", 0, true);
		motorcycle = new Vehicle("motorcycle", 2, true);
		porsche = new Vehicle("porsche", 4, true);
		
		
		System.out.println(boat.getWheels());
		System.out.println(boat.getType());
		System.out.println(boat.getIsFast());
		System.out.println(motorcycle.getWheels());
		System.out.println(motorcycle.getType());
		System.out.println(motorcycle.getIsFast());
		System.out.println(porsche.getWheels());
		System.out.println(porsche.getType());
		System.out.println(porsche.getIsFast());


	}
}
