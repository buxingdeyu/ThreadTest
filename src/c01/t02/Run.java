package c01.t02;

/**
 * �̵߳ĵ���������ԣ�
 * ���õ�˳�����
 * @author bcc
 *
 */
public class Run {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("end");
	}

}
