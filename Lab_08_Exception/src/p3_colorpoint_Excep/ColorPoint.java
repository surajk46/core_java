 package p3_colorpoint_Excep;

public class ColorPoint extends Point{
	private String color;
	private static String [] colors=new String[7];
	static
	{
		colors[0]="Red";
		colors[1]="Orange";
		colors[2]="Yellow";
		colors[3]="Green";
		colors[4]="Blue";
		colors[5]="Indogo";
		colors[6]="Voilet";
	}
	public ColorPoint(String color)throws ColorNotMatchException {
		//super();
		this.color = color;
		boolean f=false;
		for(int i=0;i<colors.length ;i++)
		{
			if(colors[i].equalsIgnoreCase(color))
			{
				f=true;
				break;
			}
		}
		if(f==true)
		{
			System.out.println("colour found in given array...");
		}
		else
		{
			throw new ColorNotMatchException();
		}
	}
	public void display()
	{
		for(int i=0;i<colors.length;i++)
		{
			System.out.println(colors[i]);
		}
	}
	
}
