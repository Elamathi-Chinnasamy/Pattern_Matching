import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.print("Enter the number: ");
	   int num = scan.nextInt();
	   int result =1;
	   
	   for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j <=i; j++)
            {
                System.out.print(result+" ");
                result++;
            }
            System.out.println();
        }
        
    }
}

