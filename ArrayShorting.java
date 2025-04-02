package ksr.com.array;

public class ArrayShorting {  //Sorting array in ascending order.
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2,3,6,7};
		int l=arr.length;
	
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int temp[]= new int[l];
		int index=0;
		for(int i=0;i<l-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[index++]=arr[i];
			}
		}
		temp[index++]=arr[l-1];
		System.out.print("Removed duplicate elements: ");
		for(int i=0;i<index;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}

}
