import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number(Height): ");
		int height = scan.nextInt();
		System.out.print("Enter a number(width): ");
		int width = scan.nextInt();
		for (int i = 0; i < height; i++) 
		{
			for (int j = 0; j < width; j++)
			{
				if (j == 0 || i == 0 || i == height - 1 || i == height / 2) 
				{
					System.out.print("*");
				} 
				else 
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}
