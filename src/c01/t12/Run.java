package c01.t12;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t = new Thread(c);
		t.setName("A");
		t.start();
	}

}
