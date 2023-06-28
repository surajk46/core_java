package office.staff;

public class Date
{
   
   private int dd;   
   private int mm;
   private int yy;
   
   public Date()
   {
//	 super();
	dd=1;
	mm=1;
	yy=1970;
   }	
 		
   public Date(int dd,int mm,int yy)
   {
	// super();
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
   } 

   public String toString() 
   {
	return ""+dd+"/"+mm+"/"+yy+"";
}

   
   public void showDate()
   {
	System.out.println(dd+"/"+mm+"/"+yy);
   }

   

  
}