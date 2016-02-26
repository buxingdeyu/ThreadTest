package c01.t08;

public class BLogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
		super.run();
	}
}
