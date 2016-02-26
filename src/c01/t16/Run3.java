package c01.t16;

public class Run3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1);
		t.interrupt();
		System.out.println("=========================ÊÇ·ñÍ£Ö¹1£º"+t.isInterrupted());
		System.out.println("=======================ÊÇ·ñÍ£Ö¹2£º"+t.isInterrupted());
	}

}
