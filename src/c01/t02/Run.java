package c01.t02;

/**
 * 线程的调用有随机性：
 * 调用的顺序随机
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
