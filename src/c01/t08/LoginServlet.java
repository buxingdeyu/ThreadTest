package c01.t08;

public class LoginServlet {

	private static String usernameRef;

	private static String passwordRef;

	/**
	 * 加了synchronized关键字就没错
	 * @param username
	 * @param password
	 */
	synchronized public static void doPost(String username, String password) {

		try {
			usernameRef = username;

			if (username.equals("a")) {
				Thread.sleep(5000);
			}
			passwordRef = password;

			System.out.println("username:" + usernameRef + ";password:" + passwordRef);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
