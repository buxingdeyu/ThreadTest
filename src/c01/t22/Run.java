package c01.t22;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(8000);
			t.stop();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}

		System.out.println("end");
	}

}
