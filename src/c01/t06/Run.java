package c01.t06;

/**
 * 不共享数据的情况
 * @author bcc
 *
 */
public class Run {

	public static void main(String[] args) {
		
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
		
	}

}
