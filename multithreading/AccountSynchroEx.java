package multithreading;

public class AccountSynchroEx implements Runnable {

	private Account account= new Account();
	public static void main(String[] args) {
		AccountSynchroEx accountSynchroEx = new AccountSynchroEx();
		Thread thread1 = new Thread(accountSynchroEx);
		Thread thread2 = new Thread(accountSynchroEx);
		thread1.setName("Rincy");
		thread2.setName("Anu");
		thread1.start();
		thread2.start();
		

	}
	@Override
	public void run() {
		for(int i=1;i<=3;i++)
		{
			makeWithdraw(1000);
		}
	}
	
	
	synchronized void makeWithdraw(int amount) {

     if(account.getBalance()>=amount)
     {
    	 System.out.println(Thread.currentThread().getName()+" is going to withdraw");
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 account.withdraw(amount);
    	 System.out.println(Thread.currentThread().getName()+" complete withdrow. Balance : "+account.getBalance());
     }
     else
     {
    	 System.out.println("Not enough balance in account for "+Thread.currentThread().getName()+" Balance : "+account.getBalance());
     }
     
		
	}

}
