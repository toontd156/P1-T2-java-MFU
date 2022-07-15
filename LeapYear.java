public class LeapYear {
	public static void main(String[] args) {
		int year = 2024;
		boolean leapYear = false;
		//complete this code using if-else statements
		if (year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
                else{
                    leapYear = false;
                }
            }
            else{
                leapYear = true;
            }
        }
        else{
            leapYear = false;
        }
		if (leapYear){
			System.out.println(year + " is leap year");
        }
		else{
			System.out.println(year + " is not leap year");
        }
	}
}
