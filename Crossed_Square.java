import java.util.*;
public class Main
{
	public static void main (String[] args) 		
	{
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            
            for(int i=1; i<=num; i++)
            {
                for(int j=1; j<=num; j++)
                {
                    if(i==1 || j==1 || i==num || j==num || i==j || j==num-i+1)
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