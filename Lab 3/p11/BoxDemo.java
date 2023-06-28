package p11;

//import p8.Box;

class BoxDemo
{
	public static void main(String [] args)
	{
		/*  Box b1=new Box();     // calling default constructor
		b1.showBox();	

		Box b2=new Box(3,3,3);     // calling fully parameterized Constructor
		b2.showBox();

		Box b3=new Box(10);	// calling semi parameterized Constructor
		b3.showBox();			*/
		
		Box []ar=new Box[3];
		ar[0]=new Box(5,5,5);
		ar[1]=new Box(4,4,4);
		ar[2]=new Box(6,6,6);
		/*  for(int i=0;i<ar.length;i++)
		{
			ar[i].showBox();
		}  */
		int max =ar[0].volume();
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i].volume())
				{
					max=ar[i].volume();
					count=i;
				}
		}
		System.out.println("The box having maximun Volume is : ");
		ar[count].showBox();
		
	}
}