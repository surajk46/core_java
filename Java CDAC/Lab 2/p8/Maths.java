class Maths
{
	

	// MEMBER FUNTION

	public void sum(int i1,int i2)
	{
		int c=i1+i2;
		System.out.printf("Addition of %d and %d is = %d \n",i1,i2,c);	
	}
	public void sum(int i1,int i2,int i3)
	{
		System.out.printf("Addition of %d , %d and %d is = %d \n",i1,i2,i3,i1+i2+i3);
	}
	public void sum(float f1,float f2)
	{
		System.out.printf("Addition of %f and %f is = %f \n",f1,f2,f1+f2);
	}
	public void sum(int i1,float f1,double d1)
	{
		double c=(double)i1+(double)f1+d1;
		System.out.println("Addition of "+i1+" , "+f1+" and "+ d1 +"is =  "+c );
	}
	
}
