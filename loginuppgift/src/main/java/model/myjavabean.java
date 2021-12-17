package model;

public class myjavabean {
	
	private String username;
	private String password;
	private String msg;
	
	public void setUsername(String username) {
		
		this.username = username;
		
	}
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		
		return password;
	}
	
	public void  setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	
	public boolean check() {
		
		return userhandler.chekUser(username, password);
		
		
		
	}

}
