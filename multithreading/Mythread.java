package multithreading;

public class Mythread extends Thread {

	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Currently executing Thread : "+getName());

		}
		
			}

   public static void main(String[] args)
    {
	   Mythread t1 = new Mythread(); //creating Thread
	   t1.setName("Rincy"); //setting thread name
	   t1.start();  //starting a thread
	   
	   Mythread t2 = new Mythread(); //creating Thread
	   t2.setName("Pooja"); //setting thread name
	   t2.start();  //starting a thread
	   
	   
    }

}
