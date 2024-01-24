package multithreading;

public class MyThread2 implements Runnable{

	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Currently executing thread: "+Thread.currentThread().getName());
		}
	}
	
	
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		
		Thread t1 = new Thread(myThread2); //creating thread
		t1.setName("Rincy");
		t1.start();
		
		Thread t2 = new Thread(myThread2);  //creating thread
		t2.setName("Pooja");
		t2.start();

	}

}
