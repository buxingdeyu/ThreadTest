package c01.t16;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ1��"+Thread.interrupted());
		System.out.println("�Ƿ�ֹͣ2��"+Thread.interrupted());
	}

}
