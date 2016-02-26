package c01.t08;

public class ALogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
		super.run();
	}
}
