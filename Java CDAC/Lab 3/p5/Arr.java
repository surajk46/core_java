import java.util.*;
public class Arr
{
public static void main(String [] a)
{
	int []ar=new int [5];
	Scanner sc=new Scanner(System.in);
	int sum=0;
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("Value of ar["+i+"] ="+ar[i]);
		ar[i]=sc.nextInt();
		sum=sum+ar[i];
	}
	int max=ar[0];
	int min=ar[0];
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("Value of ar["+i+"] ="+ar[i]);
		if(ar[0]>ar[i])
			min=ar[i];
		if(ar[0]<ar[i])
			max=ar[i];
	}
	System.out.println("Average of given Array ="+sum/ar.length);
	System.out.println("Maximum value of  given Array ="+max);
	System.out.println("Minumum value of given Array ="+min);
}
}