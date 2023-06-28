package opps2;
class Box
{
	private int l,b,h;

	public Box() {
		super();
		l=0;
		b=0;
		h=0;
	}
	public Box(int l) {
		super();
		this.l = l;
		this.b = l;
		this.h = l;
	}
	public Box(int l, int b, int h) {
		super();
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public int volume()
	{
		return l*b*h;
	}
	@Override
	public String toString() {
		return "Box length = " + l + "\nBreadth = " + b + "\nHeight = " + h +"\nVolume = "+volume();
	}
	
	
}
public class BoxMain {

	public static void main(String[] args) {
		Box []a=new Box[3];
		a[0]=new Box(5);
		a[1]=new Box(10,5,50);
		a[2]=new Box(15,10,2);
		int max=a[0].volume();
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i].volume())
			{
				max=a[i].volume();
				index=i;
			}
		}
		System.out.println(a[index]);
	}

}
