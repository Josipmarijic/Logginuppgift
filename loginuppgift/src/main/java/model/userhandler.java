package model;

public class userhandler {

	private static String thumbup = "thumbup.png";
	private static String thumbdown = "thumbdown.png";
	
	public static boolean chekUser (String user1, String password1) {
		
		if(user1.equals("josip") && password1.equals("josip")) {
			return true;
		}else if (user1.equals("marcus") && password1.equals("marcus")) {
			return true;
		}else {}
		return false;
	}
}
