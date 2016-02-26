package c01.t19;

/**
 * 停止线程的可用方法：异常法
 * @author bcc
 *
 */
public class MyThread extends Thread {
	
	public  void run(){
		try{
		for(int i = 0;i<50000;i++){
			if(Thread.interrupted()){
				System.out.println("已经是停止状态了，我要退出了");
				throw new InterruptedException();
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("for循环后面，又运行输出了");
		}catch(InterruptedException e){
			System.out.println("MyThread catch ");
			e.printStackTrace();
		}
	}
}
