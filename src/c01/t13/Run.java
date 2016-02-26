package c01.t13;

public class Run {
	public static void main(String [] args){
		MyThread t = new MyThread();
		System.out.println("begin = "+ t.isAlive());
		t.start();
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("end = "+ t.isAlive());  //这个值理论上不确定
	}
}
