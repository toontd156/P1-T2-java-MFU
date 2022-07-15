import java.util.*;

public class MainRegsystem {

    public static void main(String[] args) {
		Student objStudent = new Student("6571501001");

		System.out.print("Enter name: ");
		Scanner scan = new Scanner(System.in);

		String name = scan.next();

		objStudent.setStudentName(name);
		objStudent.displayStudent();
	}

}
