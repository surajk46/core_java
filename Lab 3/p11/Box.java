package p11;

public class Box {
		// DATA MEMBERS
		private int height;
		private int width;
		private int depth;



		// CONSTRUCTORS
		// DEFAULT CONSTRUCTOR
		public Box()
		{
			height=5;
			width=5;
			depth=5;
		}
		// FULL PARAMETERIZED CONSTRUCTOR
		public Box(int h,int w,int d)
		{
			height=h;
			width=w;
			depth=d;
		}

		// SEMI PARAMETERIZED CONSTRUCTOR
		public Box(int h)
		{
			height=h;
		}



		//MEMBER FUNCTION
		public int volume()
		{
			int v=height*width*depth;
			return v;
		}
		public void showBox()
		{
			System.out.println("height= "+height);
			System.out.println("width= "+width);
			System.out.println("depth= "+depth);
			System.out.println("volume = " + volume());
			System.out.println();
			System.out.println();
		}
	}
