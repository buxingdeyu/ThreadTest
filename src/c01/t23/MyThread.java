package c01.t23;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("MyThread catch()");
			e.printStackTrace();
		}
	}

}
