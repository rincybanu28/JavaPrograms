package multithreading;

public class ThreadTypesEx extends Thread {

	public static void main(String[] args) {
		
		ThreadTypesEx t1 = new ThreadTypesEx();
		ThreadTypesEx t2 = new ThreadTypesEx();
		ThreadTypesEx t3 = new ThreadTypesEx();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
		@Override
		public void run() {
			if(Thread.currentThread().isDaemon())
			{
				System.out.println("Functionality of Daemon Thread : "+getName());
			}
			else
			{
				System.out.println("Functionality of User Thread : "+getName());
			}
			
		}

	

}
