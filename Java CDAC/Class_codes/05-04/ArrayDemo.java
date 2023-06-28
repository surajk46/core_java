import java.lang.Math;
import java.util.Scanner;
public class ArrayDemo
{
    public static void main(String [] args)
    {
	/*
	//declartion of array
	int [] arr;
	arr = new int[5];
	for(int i=0;i<arr.length;i++)
	{
	    arr[i] = (int)(Math.random()*10);
	}
	
	for(int i=0;i<arr.length;i++)
	{
	    System.out.println(arr[i]);	
	}

	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	    System.out.println("Enter the value : ");
	    arr[i] = sc.nextInt();
	}
        System.out.println("Array elements : ");
        for(int i=0;i<arr.length;i++)
	{
	    System.out.println(arr[i]);	
	}  
	*/
	Account [] acc_arr;
	acc_arr = new Account[3];   //array of accounts
	acc_arr[0] = new Account();    //creating one element
	acc_arr[1] = new Account(1001,10000.00f); 
	acc_arr[2] = new Account(1010, 15000.00f); 
	for(int i=0;i<acc_arr.length;i++)
		System.out.println(acc_arr[i].calBalance());

	//short way for cerating array
	int [] arr = {23, 45, 32, 11, 67};
	Date [] datearr = {new Date(), new Date(11,11,1999}, new Date(13,12,2000)};

	
    }	
}