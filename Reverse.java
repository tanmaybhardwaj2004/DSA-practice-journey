package ArrayReversal;
import java.util.*;
public class Reverse {
	public void rev(int i,int arr[], int n)
	{
		if(i>=n/2)
			return ;
		int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
		
        rev(i+1,arr,n);
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()	;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Reverse obj=new Reverse();
		obj.rev(0, arr, n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"");
		}
		sc.close();
	}
}
