import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		int i, num, fac = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number...");
		num = input.nextInt();
		if (num >= 0) {
			//complete this code using for statement and print its result
            for (i = 1; i <= num; i++) {
                fac = fac * i;
            }
            System.out.println("Factorial of " + num + " = " + fac);
		} 
		else {
			System.out.println("Unable to calculate");
		}
	}
}
