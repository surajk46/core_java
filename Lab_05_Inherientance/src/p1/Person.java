package p1;

public class Person {
		// data members
		private String name;
		private Date bdate;



		// Constructors
		// Default Constructor
		public Person()
		{
			
		}

		
		// constructor of string and object of date
		public Person(String name, Date bdate) {
			this.name = name;
			this.bdate = bdate;
		}



		public Person(String name,int dd,int mm,int yy)
		{
			this.name=name;
			this.bdate=new Date(dd,mm,yy);
		}

		//Member function
		public void display()
		{
			System.out.println("Name of Person : "+name);
			if(bdate!=null)
			{
				System.out.println("BirthDate of Person : ");
				bdate.showDate();
			}
		}

	}

