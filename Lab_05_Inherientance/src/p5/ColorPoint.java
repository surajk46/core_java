 package p5;

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
	public ColorPoint(String color) {
		//super();
		this.color = color;
		for(int i=0;i<colors.length ;i++)
		{
			if(colors[i]==color)
				colors[i]=color;
			else
				colors[i]="white";
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
