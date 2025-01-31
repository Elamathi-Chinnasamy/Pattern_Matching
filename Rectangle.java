import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter the lenth of rectangle: ");
        int rows = scan.nextInt();  
        System.out.print("Enter the breadth of rectangle: ");
        int columns = scan.nextInt(); 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

