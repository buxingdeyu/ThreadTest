package c01.t22;

public class MyThread extends Thread {
	private int i = 0;

	@Override
	public void run() {
		try {
			while (i<100) {
				i++;
				System.out.println("i=" + i);
				Thread.sleep(1);
			}
			System.out.println("thread end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
