package c01.t17;

public class MyThread extends Thread {
	
	public  void run(){
		for(int i = 0;i<50000;i++){
			if(Thread.interrupted()){
				System.out.println("�Ѿ���ֹͣ״̬�ˣ���Ҫ�˳���");
				break;
			}
			System.out.println("i="+(i+1));
		}
	}
}
