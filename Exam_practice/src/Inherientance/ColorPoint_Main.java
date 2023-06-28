package Inherientance;
class ColorPoint
{
	private String color;
	private static String [] colors;
	
	static
	{
		colors=new String [7];
		colors[0]="Red";
		colors[1]="Orange";
		colors[2]="Yellow";
		colors[3]="Green";
		colors[4]="Blue";
		colors[5]="Indigo";
		colors[6]="Violet";
	}

	public ColorPoint() {
		super();
		this.color = "";
	}


	public ColorPoint(String color) {
		super();
		this.color = color;
		
		for(int i=0;i<colors.length;i++)
		{
			if(colors[i]!=color)
			{
				colors[i]="White";
			}
		}
	}
	public void show()
	{
		for(int i=0;i<colors.length;i++)
		{
			System.out.println(colors[i]);
		}
	}
	@Override
	public String toString() {
		return "ColorPoint color=" + color;
	}

}

public class ColorPoint_Main {
	public static void main(String[] args) {
		ColorPoint c=new ColorPoint("Yellow");
		c.show();
	}
}
