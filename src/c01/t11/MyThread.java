package c01.t11;

public class MyThread extends Thread {

	public MyThread(){
		System.out.println("���캯���򵹣�"+Thread.currentThread().getName());
	}
	
	public void run(){
		System.out.println("run ������"+Thread.currentThread().getName());
	}
}
