package p6;

import java.io.Serializable;

public class Person  implements Serializable{
		// data members
		private String name;
		private Date bdate;
		public int getYy()
		{
			return bdate.getYy();
		}
		public Person() {
			super();
		}

		public Person(String name, Date bdate) {
			super();
			this.name = name;
			this.bdate = bdate;
		}
		public Person(String name, int dd,int mm,int yy) {
			super();
			this.name = name;
			this.bdate = new Date(dd,mm,yy);
		}
		@Override
		public String toString() {
			return "\nPerson name = " + name + "\nBirthdate " + bdate;
		}
		
		

	}

