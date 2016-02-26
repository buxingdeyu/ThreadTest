package c01.t20;

/**
 * 停止线程的可用方法：沉睡中停止线程
 * 
 * @author bcc
 *
 */
public class MyThread extends Thread {

	public void run() {
		try {
			System.out.println("run begin");
			Thread.sleep(2000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("沉睡中被停止，进入catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
