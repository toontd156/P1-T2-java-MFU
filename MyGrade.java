public class MyGrade {
	public static void main(String[] args)
	{
		int score = 79;
		char grade;

		//complete this program using if – else if – else statements 
		if(score >=80) {
            grade = 'A';
		    System.out.println("Your score = "+score);
		    System.out.println("Your grade = "+grade);
        }else if(score >=71) {
            grade = 'B';
		    System.out.println("Your score = "+score);
		    System.out.println("Your grade = "+grade);
        }else if(score >=61) {
            grade = 'C';
		    System.out.println("Your score = "+score);
		    System.out.println("Your grade = "+grade);
        }else if(score >=51) {
            grade = 'D';
		    System.out.println("Your score = "+score);
		    System.out.println("Your grade = "+grade);
        }else{
            grade = 'F';
		    System.out.println("Your score = "+score);
		    System.out.println("Your grade = "+grade);
        }
	}
}
