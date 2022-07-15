import javax.swing.*;
public class oop1 {

    public static void main(String[] args) {
		int time, second, minute, hour;
        
		String input = JOptionPane.showInputDialog(null, "Enter Seconds?");
		time = Integer.parseInt(input);
        hour = time / 3600;
        minute = time % 3600 / 60;
        second = time % 3600 % 60 % 60;
		System.out.println(time);
        System.out.println("It equals to " + hour +"h:" + minute + "min:" + second + "s");
	}


}
