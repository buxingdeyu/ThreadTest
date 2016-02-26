package c01.t16;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().interrupt();
		System.out.println("ÊÇ·ñÍ£Ö¹1£º"+Thread.interrupted());
		System.out.println("ÊÇ·ñÍ£Ö¹2£º"+Thread.interrupted());
	}

}
