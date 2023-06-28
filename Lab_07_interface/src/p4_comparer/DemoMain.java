package p4_comparer;

import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		Comparer c=null;
	
		Scanner sc=new Scanner(System.in);
		Student []arr= {new Student(256,"suraj",35),new Student(515,"omkar",96),new Student(55,"Saurabh",97),new Student(78,"Nishant",78)};
		System.out.print("Enter 0 for sort by rollnumber and 1 for sory by Name and 2 for sort by Merit : ");
		int n=sc.nextInt();
		if(n==0)
			{
				c=new RollComparer();
			}
		else if(n==1)
			{
				c=new NameComparer(); 
			}
		else if(n==2)
			{
				c=new MeritComparer();
			}
		//Comparer c=new RollComparer();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(c.comparer(arr[i],arr[j])>0)
				{
					Student temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			System.out.println("***************************************");
		}
		
	}

}
