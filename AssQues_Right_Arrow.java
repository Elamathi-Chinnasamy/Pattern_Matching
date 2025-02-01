import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int i,j,k;

		for(i = 1; i <= input; i++)
		{
			for(j = 1; j <=2; j++)
			{
				for(k=1; k<=i-1; k++)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		for(k=1; k<=2; k++)
		{
			for(i=1; i<=input; i++)
			{
				for(j=1; j<=2; j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(i=input; i>=1; i--)
		{
			for(j=1;  j<=2; j++)
			{
				for(k=1; k<=i-1; k++)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}

