package c01.t21;

/**
 * ֹͣ�̵߳Ŀ��÷�������˯��ֹͣ�߳�
 * 
 * @author bcc
 *
 */
public class MyThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 100000; i++) {
				System.out.println("i="+(i+1));
			}
			System.out.println("run begin");
			Thread.sleep(2000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("��ֹͣ��������sleep,����catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
