package p1_p2_2numbersExc_array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_ExceptionMain {

	public static void main(String[] args) {
		try
		{
			System.out.print("Enter Length Of Array : ");
			Scanner sk=new Scanner(System.in);
			int n=sk.nextInt();
			int []arr=new int [n];
			
			System.out.print("Enter Element Of Array : ");
			for(int i=0;i<n;i++)
			{
				arr[i]=sk.nextInt();
			}
			System.out.print("Enter Index of Array To see Elements : ");
			int shivam=sk.nextInt();
				System.out.print(arr[shivam]);
		}
		catch(InputMismatchException e)
		{
			System.out.println("From InputMismatchException Block ");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("From ArrayindexOutOfBondsException Block ");
			System.out.println(e.getMessage());
		}
		catch(OutOfMemoryError e)
		{
			System.out.println("From OutOfMemoryerror Block ");
			System.out.println(e.getMessage());
		}
		catch(MatchException e)
		{
			System.out.println("From MatchException Block ");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("From Exception Block ");
			System.out.println(e.getMessage());
		}
		

	}

}
