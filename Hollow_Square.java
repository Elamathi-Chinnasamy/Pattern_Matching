import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter the number: ");
        int num = scan.nextInt();  
       

        for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j <=num; j++)
            {
                if(i==1 || j==1 || i==num || j==num)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

