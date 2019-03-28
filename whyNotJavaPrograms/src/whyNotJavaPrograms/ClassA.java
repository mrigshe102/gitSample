package whyNotJavaPrograms;
/**
* @author      Mrigank Shekhar <mrigankshekhar@icloud.com>
* @version     1.0          (current version number of program)
* @since       1.0          (the version of the package this class was first added to)
*/
import java.util.Scanner;

public class ClassA {
public static void main(String[] args) {
	/*
	 * Printing triangle of stars - 
	 * 	* 
	 * 	* * 
	 * 	* * * 
	 * 	* * * * 
	*/
	System.out.print("How many stars you want? __");
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
		for(int i=1;i<=a;i++)
		{
			for (int j=0; j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
