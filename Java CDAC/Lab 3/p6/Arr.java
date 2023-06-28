import java.util.*;
public class Arr
{
public static void main(String [] a)
{
	int [][]ar=new int [3][3];
	int []rowSum=new int [3];
	int []colSum=new int [3];
	Scanner sc=new Scanner(System.in);
	int sum=0;
	//System.out.println(ar.length);
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("Enter "+i+"th array : ");
		int sumRow=0;
		int sumCol=0;
		for(int j=0;j<3;j++)
		{
			System.out.println("Value of ar["+i+"]["+j+"] ="+ar[i][j]);
			ar[i][j]=sc.nextInt();
			sumRow=sumRow+ar[i][j];
			sumCol=sumCol+ar[j][i];
		}
		rowSum[i]=sumRow;
		colSum[i]=sumCol;
	}
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("ar["+i+"]["+j+"] ="+ar[i][j]+"    ");
		}
		System.out.println();
	}
	for(int k=0;k<rowSum.length;k++)
		{
			System.out.println("Sum of row "+k+" = "+rowSum[k]);
		}
	for(int k=0;k<colSum.length;k++)
		{
			System.out.println("Sum of col "+k+" = "+colSum[k]);
		} 
}
}