package c01.t07;

public class MyThread extends Thread {

	private int count = 5;
	
	@Override
	public void run() {
		super.run();
		count --;
		System.out.println("��"+Thread.currentThread().getName()+"���㣬count="+count);
	}
	
}
