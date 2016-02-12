package c01.t03;

public class Test {

	public static void main(String[] args) {
		try{
			MyThread t = new MyThread();
			t.setName("myThread");
			t.start();
			for(int i=0 ; i<10 ; i++){
				int time=(int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("main = "+Thread.currentThread().getName());
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
