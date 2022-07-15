import java.util.*;
public class InOutTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?...");
		String name;
		name = input.nextLine(); //wait for String

		System.out.print("Midterm score?...");
		double midterm;
		midterm = input.nextDouble(); //wait for floating-point number

		System.out.print("OOP's grade?...");
		char grade;
		grade = input.next().charAt(0); //wait for character, 0 means the first letter

		System.out.println("Your name is "+name);
		System.out.println("Your midterm score is "+ midterm);
		System.out.println("For OOP subject, I will get "+ grade);
	}
}
