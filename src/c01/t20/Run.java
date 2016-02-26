package c01.t20;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(200);
			t.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}

		System.out.println("end");
	}

}
