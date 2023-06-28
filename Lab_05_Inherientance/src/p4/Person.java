package p4;

import java.util.Scanner;

public class Person {
		// data members
		private String name;
		private Date bdate;
		Scanner sc=new Scanner(System.in);


		// Constructors
		// Default Constructor
		public Person()
		{
			System.out.print("Enter Name of Person : ");
			this.name = sc.nextLine();
			this.bdate = new Date();
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
		
		
		public String toString() {
			return "Name of Person = "+name+"\nBirthdate = "+bdate+"\n" ;
		}

	}

