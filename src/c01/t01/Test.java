package c01.t01;

/**
 * 每个进程至少含有一个线程
 * main方法就有一个线程
 * @author bcc
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //main
	}

}
