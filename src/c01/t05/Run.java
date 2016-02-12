package c01.t05;

public class Run {

	public static void main(String[] args) {
		Runnable run = new MyRunnable();
		Thread t = new Thread(run);
		t.start();
		System.out.println("end");
	}

}
