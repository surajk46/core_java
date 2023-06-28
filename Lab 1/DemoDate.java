class Date
{
  // data member // variable
  private int dd;
  private int mm;
  private int yy;

  // member Function  // function
  public void showDate()
  {
	System.out.println(dd+"/"+mm+"/"+yy);
  }
}

public class DemoDate
{
  public static void main(String [] args)
  {
    int n;
    Date d1;
    n=100;
    d1=new Date();
    d1.showDate();
  }
}