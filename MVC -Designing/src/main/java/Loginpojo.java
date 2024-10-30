
public class Loginpojo {
	String uname;
	String pass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean blLogicLogin() {
		if (uname.equals("harshit") && pass.equals("harshit")) {
			return true;
		}
		else {
			return false;
		}
	}

}
