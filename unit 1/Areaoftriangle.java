import java.util.Scanner;

public class Areaoftriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter base of triangle: ");
		double base = sc.nextDouble();

			
		System.out.print("enter height of triangle: ");
		double height = sc.nextDouble();
		
		Double triangleArea = (base * height) / 2 ;


		System.out.println(" Area of triangle = " + triangleArea);

		
		
	sc.close();
	}
}