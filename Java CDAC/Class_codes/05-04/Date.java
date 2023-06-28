//no acesss specifier for class - package
//user defined entity
class Date
{
   //data members
   //created on heap - 0/0.0/false/'\0000'
   private int dd;   
   private int mm;
   private int yy;
   //private boolean leapYear;

   //no-arg or default constructor
   public Date()
   {
	dd=1;
	mm=1;
	yy=1970;
   }	
   //parameterised construtors		
   public Date(int dd,int mm,int yy)
   {
	this.dd=dd;
	mm=mm;
	this.yy=yy;
   } 

   //parameterised(copy) cons 
   public Date(Date d)
   {
        //this - current object
	//d is accepted as input
	this.dd = d.dd;
	this.mm = d.mm;
	this.yy = d.yy;
   } 

   //member methods
   public void showDate()
   {
	System.out.println(dd+"/"+mm+"/"+yy);
   }

   public void showDate(char ch)
   {
	//System.out.println(dd+ch+mm+ch+yy);   //number
	System.out.println(dd+""+ch+mm+""+ch+yy);   //string
   }	

   public boolean isLeapYear()
   {
	boolean flag =false;
	if(yy%4 == 0 && (yy%400 == 0 || yy%100!=0))
		flag = true;
	return flag;
   } 
}