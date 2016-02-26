package c01.t14;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t = new Thread(c);
		System.out.println("t.isAlive():"+t.isAlive());
		t.setName("A");
		t.start();
		System.out.println("t.isAlive():"+t.isAlive());
	}

}
