package project02;
import java.util.Scanner;

public class User {
	private String id;
	private String password;
	private String loginStatus;
	private String registerDate;

	public void setID(String sID) {
		id = sID;
	}

	public String getID() {
		return id;
	}

	public void setPassword(String sPassword) {
		password = sPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setLoginstatus(String sLoginStatus) {
		loginStatus = sLoginStatus;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setRegisterDate(String sRegisterDate) {
		registerDate = sRegisterDate;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public boolean verifyLogin() {
        if(id == null) {
            return false;
        }
        else {
            return true;
        }
	}
}
