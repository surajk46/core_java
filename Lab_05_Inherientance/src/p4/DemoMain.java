package p4;

public class DemoMain {
public static void main(String[] args) {
			
			/*System.out.println("****Object of Not Parameterized Doctor****");	
			Doctor p2=new Doctor();
			p2.display();	
			System.out.println(p2);*/
			
			Doctor []ar=new Doctor [1];
			ar[0]=new Doctor();
			//ar[1]=new Doctor();
			
			for(int i=0;i<ar.length;i++)
			{
				//ar[i].display();
				System.out.println(ar[i]);
			}
			
		}
}

