package opps2;
class Date
{
	private int dd,mm,yy;
	private static int count=0;

	public Date() {
		super();
		dd=0;
		mm=0;
		yy=0;
		count++;
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		count++;
	}
	public void showDate() {
		System.out.println("DD = "+dd);
		System.out.println("MM = "+mm);
		System.out.println("YY = "+yy);
	}
	public void showDate(char ch) {
		System.out.println(dd+ch+mm+ch+yy);
		System.out.println(dd+""+ch+mm+""+ch+yy);
	}
	public int count() {
		return count;
		}
}
public class DateMain {

	public static void main(String[] args) {
		Date d1=new Date(4,4,2000);
		d1.showDate();
		d1.showDate('-');
		System.out.println("Cpunt = "+d1.count());

		Date d2=new Date(2,11,1999);
		d2.showDate();
		d2.showDate('-');
		System.out.println("Cpunt = "+d1.count());

		

	}

}
