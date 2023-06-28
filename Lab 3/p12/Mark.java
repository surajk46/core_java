package p12;
import java.util.Scanner;
public class Mark {
	private int []mark;
	public void suraj()
    {
	  int c = Student.getNoOfsub();
	  mark=new int[c];
	  Scanner sc= new Scanner(System.in);
	  for(int i=0;i<c;i++)
	  {
		  System.out.println("enter the mark of sub "+(i+1)+" = ");
		  mark[i] = sc.nextInt();
	  }
	
	  for(int i=0;i<2;i++)
		  System.out.println("mark = "+mark[i]);
    }
}
