class BoxArr
{
	public static void main(String [] args)
	{
		Box []sk = new Box[3];
		sk[0]=new Box();
		sk[0].showBox();

		sk[1]=new Box(10,10,10);
		sk[1].showBox();

		sk[2]=new Box(20,20,20);
		sk[2].showBox();

	}
}