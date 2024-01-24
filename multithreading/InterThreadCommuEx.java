package multithreading;

class Customer
{
	private int balance =10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw Rs."+amount);
		if(balance<amount)
		{
			System.out.println("Not enough balance in account. waiting for deposit..");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance= balance - amount;
		System.out.println("Rs. "+amount+" withdraw. Balance : "+balance);
	}
		synchronized void deposit(int amount)
		{
			System.out.println("Going to deposit Rs."+amount);
			balance= balance + amount;
			System.out.println("deposited Rs. "+amount+" Balance : "+balance);
			notify();
		}
	
}
public class InterThreadCommuEx {

	public static void main(String[] args) {
		Customer customer = new Customer();
		new Thread("Rincy")
		{
			public void run() {customer.withdraw(15000);};
		}.start();
		
		new Thread("Anu")
		{
			public void run() {customer.deposit(20000);};
		}.start();

	}

}

