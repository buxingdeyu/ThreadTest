package c01.t09;

public class MyThread extends Thread {

	private int i = 5;
	
	public void run(){
		i--;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("i="+(i--)+"  threadName :"+Thread.currentThread().getName());
	}
}
