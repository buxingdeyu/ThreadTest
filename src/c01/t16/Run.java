package c01.t16;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1000);
		t.interrupt();
		System.out.println("ÊÇ·ñÍ£Ö¹1£º"+t.interrupted());
		System.out.println("ÊÇ·ñÍ£Ö¹2£º"+t.interrupted());
	}

}
