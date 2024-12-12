package selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {6,2,8,4,5,3,1,7};
		
		for(int i=0;i<arr.length;i++)
		{   int smallest=i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
