package c01.t15;

public class Run2 {

	public static void main(String[] args) {
		Thread test = Thread.currentThread();
		System.out.println(test.getId());
		MyThread2 t  = new MyThread2();
		System.out.println("begin ="+ System.currentTimeMillis());
		t.start();
		System.out.println("run = "+ System.currentTimeMillis());
		System.out.println(t.getId());
	}

}
