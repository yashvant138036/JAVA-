import java.util.Scanner;

public class Areaofsquare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter length of square: ");
		double length = sc.nextDouble();
		
		Double squareArea = length * length;


		System.out.println(" Area of square= " + squareArea);

		
		
	sc.close();
	}
}