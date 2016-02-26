package c01.t15;

public class Run1 {

	public static void main(String[] args) {
		MyThread1 t  = new MyThread1();
		System.out.println("begin ="+ System.currentTimeMillis());
		t.run();
		System.out.println("run = "+ System.currentTimeMillis());
	}

}
