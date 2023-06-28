import java.lang.Math;
import java.util.*;
public class Arrey1
{
public static void main(String [] s)
{
	int []arr=new int [3] ;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=(int)(Math.random()*10);
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter arr["+i+"]");
		arr[i]=sc.nextInt();
	}
		System.out.println("Yours Arreys :");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}


	Account []arr_a = new Account[3];
	arr[0]=new Acoount();
	arr[1]=new Acoount(101,1000.00f);
	arr[2]=new Acoount(102,1500.00f);
	
	for(int i=0;i<arr_a.length;i++)
	{
		System.out.println(arr_a[i]);
	}


}
}