package c01.t16;

public class Run3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1);
		t.interrupt();
		System.out.println("=========================�Ƿ�ֹͣ1��"+t.isInterrupted());
		System.out.println("=======================�Ƿ�ֹͣ2��"+t.isInterrupted());
	}

}
