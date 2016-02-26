package c01.t11;

public class MyThread extends Thread {

	public MyThread(){
		System.out.println("构造函数打倒："+Thread.currentThread().getName());
	}
	
	public void run(){
		System.out.println("run 方法："+Thread.currentThread().getName());
	}
}
