package p1;

public class DemoMain {
public static void main(String[] args) {
			System.out.println("****Object of Parameterized Person****");	
			Person p1=new Person("Shiv",28,3,2001);
			p1.display();
			System.out.println();

			
			System.out.println("****Object of Not Parameterized Person****");	
			Person p2=new Person();
			p2.display();	
			System.out.println();
			
			System.out.println("****Object of Not Parameterized Emp****");
			Emp e1=new Emp();
			e1.display();
			System.out.println();
			
			System.out.println("****Object of Parameterized Emp****");
			Emp e2=new Emp("sk",4,6,2000,25,25000.00);
			e2.display();
			System.out.println();
		}
}

