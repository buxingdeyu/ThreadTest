package c01.t15;

public class TestGetId {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getId());
	}

}
