package c01.t16;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(1000);
		t.interrupt();
		System.out.println("�Ƿ�ֹͣ1��"+t.interrupted());
		System.out.println("�Ƿ�ֹͣ2��"+t.interrupted());
	}

}
