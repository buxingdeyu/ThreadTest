package c01.t19;

/**
 * ֹͣ�̵߳Ŀ��÷������쳣��
 * @author bcc
 *
 */
public class MyThread extends Thread {
	
	public  void run(){
		try{
		for(int i = 0;i<50000;i++){
			if(Thread.interrupted()){
				System.out.println("�Ѿ���ֹͣ״̬�ˣ���Ҫ�˳���");
				throw new InterruptedException();
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("forѭ�����棬�����������");
		}catch(InterruptedException e){
			System.out.println("MyThread catch ");
			e.printStackTrace();
		}
	}
}
