public class MyOperator {

	public static void main(String[] args) {
		int num1 = 5, num2 = 3;
		float num3 = 3f;
		//display output using printf (%d = format specifier for decimal number / integer)
		System.out.printf("Integer: number1 = %d and number2 = %d\n", num1, num2);
		//use operators
		System.out.print("result of addition : "+ (num1 + num2));
		System.out.print(", result of subtraction : "+ (num1 - num2)); //line 13
		System.out.print(", result of multiplication : "+ (num1 * num2));
		System.out.print(", result of division : "+ (num1 / num2));
		System.out.println(", result of modulus : "+ (num1 % num2));
		System.out.println("result of --number1 : "+ (--num1));
		System.out.println("result of ++number2 : "+ (++num2));
		System.out.println("result of number1++ plus --number2 : "+ num1++ + --num2);
		System.out.println("result of == : "+ (num1 == num2));
		System.out.println("result of > : "+ (num1 > num2));

		//integer division
		int divInt = num1/num2;
		float divFloat = num1/num2;
		System.out.println("\nresult of int / int stored in int variable = "+divInt+", \nresult of int / int stored in float variable = "+divFloat);

		/*
		 * auto type casting
		 * one of the operands for division = float and other = int, Java implicitly casts int operand --> float
		*/
		System.out.printf("\nFloating-point number: number3 = %.2f\n", num3); //line 32: display the value of num3
		float divCast = num1/num3;
		System.out.printf("result of int / float stored in float variable = "+"%.3f", divCast); //line 34

		//use operator precedence
		int totalValue = 10 * 2 * (5 % 2);
		System.out.println("\ntotal value = "+totalValue);

	}
}
