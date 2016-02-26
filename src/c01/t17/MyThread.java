package c01.t17;

public class MyThread extends Thread {
	
	public  void run(){
		for(int i = 0;i<50000;i++){
			if(Thread.interrupted()){
				System.out.println("已经是停止状态了，我要退出了");
				break;
			}
			System.out.println("i="+(i+1));
		}
	}
}
