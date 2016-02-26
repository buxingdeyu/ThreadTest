package c01.t21;

public class Run {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("end");
	}

}
