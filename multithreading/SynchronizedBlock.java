package multithreading;

class PrintTable{
	public void print(int n) {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(n*i);
			}
		}
	}
}

class Thread1 extends Thread{
	PrintTable printTable; 
	
	public Thread1(PrintTable printTable) {
		super();
		this.printTable = printTable;
	}
	@Override
	public void run() {
		printTable.print(2);
	}
}

class Thread2 extends Thread{
	PrintTable printTable; 
	
	public Thread2(PrintTable printTable) {
		super();
		this.printTable = printTable;
	}
	@Override
	public void run() {
		printTable.print(3);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		PrintTable printTable = new PrintTable();
		Thread1 thread1 = new Thread1(printTable);
		Thread2 thread2 = new Thread2(printTable);
		thread1.setName("Rincy");
		thread2.setName("Sulfi");
		thread1.start();
		thread2.start();
	}

}
