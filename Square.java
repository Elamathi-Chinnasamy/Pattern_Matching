import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++)
		{
		    for(int j=1; j<=num; j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
