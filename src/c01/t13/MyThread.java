package c01.t13;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run = "+ this.isAlive());
	}
}