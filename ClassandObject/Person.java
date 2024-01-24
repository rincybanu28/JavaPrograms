package ClassandObject;

public /*final*/ class Person {
	
	int id;
	String name;
	MyDate dob;
	//final float PI = 3.14f;
	
	public Person() 
	{
		//PI = 3.55f;
		id = 101;
		name = "Rincy";
		dob = new MyDate(); //dd-mm-yy
	}
	
	public Person(int id, String name, MyDate dob) 
		{
			this.id = id;
			this.name = name;
			this.dob = dob;
		}
		
		public /*final*/void display()
		{
			System.out.println("Id :" +id);
			System.out.println("Name :" +name);
			dob.display();
		}

		
	}


