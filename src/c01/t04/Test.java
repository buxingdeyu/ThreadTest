package c01.t04;

public class Test {

	public static void main(String[] args) {
		MyThread t = new MyThread(1);
		MyThread t2 = new MyThread(2);
		MyThread t3 = new MyThread(3);
		MyThread t4 = new MyThread(4);
		MyThread t5 = new MyThread(5);
		MyThread t6 = new MyThread(6);
		MyThread t7 = new MyThread(7);
		MyThread t8 = new MyThread(8);
		MyThread t9 = new MyThread(9);
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
	}

}
