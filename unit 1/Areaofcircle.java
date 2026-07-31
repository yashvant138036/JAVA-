import java.util.Scanner;

public class Areaofcircle 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter radius: ");
		double radius = sc.nextDouble();
		
		Double circleArea = Math.PI * radius * radius;

		System.out.println(" Area of circle = " + circleArea);

		
		
	sc.close();
	}
}