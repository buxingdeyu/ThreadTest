package c01.t07;

/**
 * 共享数据，但出现“非线程安全”问题的情况
 * @author bcc
 *
 */
public class Run {

	public static void main(String[] args) {
		
		MyThread t = new MyThread ();
		Thread a = new Thread(t,"A");
		Thread b = new Thread(t,"B");
		Thread c = new Thread(t,"C");
		Thread d = new Thread(t,"D");
		Thread e = new Thread(t,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}

}
