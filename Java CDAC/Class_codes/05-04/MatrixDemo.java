import java.lang.Math;
import java.util.Scanner;
public class MatrixDemo
{
    public static void main(String [] args)
    {
	int [][] arr = {{3,6,2},{7,3,9},{8,2,1}};
	int [] rowsum = new int[arr.length];
	int [] colsum = new int[3];
	for(int i=0;i<arr.length;i++)
	{
	    int sum = 0; 	
	    for(int j=0;j<arr[i].length;j++)
	       	sum += arr[i][j];	
	    rowsum[i] = sum;	
	}
	for(int i=0;i<rowsum.length;i++)
	{
	    System.out.println("Sum of row "+(i+1)+" : "+rowsum[i]);
	}

	//taking columnwise sum
	for(int i=0;i<arr.length;i++)
	{
	    int sum = 0; 	
	    for(int j=0;j<arr[i].length;j++)
	       	sum += arr[j][i];	
	    colsum[i] = sum;	
	}

	for(int i=0;i<colsum.length;i++)
	{
	    System.out.println("Sum of column  "+(i+1)+" : "+colsum[i]);
	}
    }
}