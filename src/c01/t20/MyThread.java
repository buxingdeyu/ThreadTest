package c01.t20;

/**
 * ֹͣ�̵߳Ŀ��÷�������˯��ֹͣ�߳�
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
			System.out.println("��˯�б�ֹͣ������catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
