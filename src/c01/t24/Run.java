package c01.t24;

public class Run {

	public static void main(String[] args) {
		try{
			SynchronizedObject object = new SynchronizedObject();
			MyThread t = new MyThread(object);
			t.start();
			Thread.sleep(600);
			t.stop();
			System.out.println(object.getUsername()+"---"+object.getPassword());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
