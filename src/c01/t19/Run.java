package c01.t19;

public class Run {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		
		t.interrupt();
		
		System.out.println("end");
	}

}
