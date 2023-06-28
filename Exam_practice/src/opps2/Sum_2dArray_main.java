package opps2;

import java.util.Scanner;

public class Sum_2dArray_main {
	public static void main(String[] args) {
		
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int []rowSum=new int[3];
		int []colSum=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				//arr[i][j]=sc.nextInt();
				rowSum[i]+=arr[i][j];
				colSum[j]+=arr[i][j];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print("a["+i+"]["+j+"]"+arr[i][j]+"  ");
			}
			System.out.println();
		}
		for(int i=0;i<rowSum.length;i++)
		{
				System.out.print(rowSum[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<rowSum.length;i++)
		{
				System.out.print(colSum[i]+"  ");
		}
		sc.close();
		
	}
}
