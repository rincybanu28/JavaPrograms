package ClassandObject;

public class MyDate {
	
	int dd,mm,yy;
	
	public MyDate()
	{
		dd = 12;
		mm = 8;
		yy = 1995;
		
	}
	
	public MyDate(int dd, int mm, int yy) 
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public void display()
	{
		System.out.println("Date : "+dd+"-"+mm+"-"+yy);
	}

}
