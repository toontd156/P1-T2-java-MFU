public class Student {
    private String studentId;
	private String studentName;

	public Student(String studenId){
		studentId = studenId;
}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void displayStudent(){
		System.out.println("Id: " + studentId + " Name: " + studentName);
	}
}
