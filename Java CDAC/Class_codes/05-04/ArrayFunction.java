public class ArrayFunction
{
    public static void main(String [] args)
    {
	int [] arr = {4,2,8,5,6};
	System.out.println("Sum : "+sumOfArray(arr));

	/*Date d1= new Date();
	d1.showDate();*/
    }
    
    public static int sumOfArray(int [] arr)
    {
	int sum = 0;
	for(int i=0;i<arr.length;i++)
		sum+=arr[i];
	return sum;		
    }			
}	