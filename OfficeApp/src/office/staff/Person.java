package office.staff;
public class Person
{
 
   private String name;
   private Date bdate;

   
   public Person()
   {
	this.name="";
	this.bdate=new Date();
   }	
   		
   public Person(String name,int dd,int mm,int yy)
   {
	this.name=new String(name);
	this.bdate=new Date(dd,mm,yy); 
	
   } 

   
public String toString()
{
	System.out.println("*********************");
	return "Person name is "+name+ "\n bdate=" + bdate + "";
}
  }
   

  
