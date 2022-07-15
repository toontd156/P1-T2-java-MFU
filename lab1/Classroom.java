package lab1;
import java.util.Scanner;
public class Classroom { //  คบาสนี้แค่ทำการวาง การปริ้นเฉยๆ
    public static void main(String[] args) {
        Student student[] = new Student[2];
        int score , max ;
        // ดึงคำสั่ง จาก student.java
        student[0] = new Student(5400001, "John", "Nuvo");
        student[1] = new Student(5400003, "Mochael", "Paang");

        Scanner ky = new Scanner(System.in);

        System.out.print("Enter score for Student 1: ");
        score = ky.nextInt();
        student[0].setScore(score);

        System.out.print("Enter score for Student 2: ");
        score = ky.nextInt();
        student[1].setScore(score);

        if(student[0].getScore() > student[1].getScore()){
            max = student[0].getScore();
        }else{
            max = student[1].getScore();
        }

        System.out.println("\n ---Summary---");

        for(int i = 0; i < 2; i++){
            System.out.println(student[i].getFirstName()+ " : " + student[i].getScore() + " point");
        }
        System.out.println("Max Score = " + max + " points");

    }
}
