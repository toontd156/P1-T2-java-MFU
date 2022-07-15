import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args)
	{
    
		int row,col,input;
		System.out.print ("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		input = in.nextInt();

    for(row = input; row >= 1; row--){
      for(col = 2*input-1; col >= 1; col--){
        if(col >= input-(row-1) && col <= input+(row-1)){
          System.out.print(col);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  } 
}


