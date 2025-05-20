package ksr.com.Array;

public class ArrayShorting {
	
				public static void main(String[] args) {
					int arr[]= {1,2,3,4,2,3,5,6,4};
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
					System.out.println("ArrayShort ");
					for(int i=0;i<l;i++)
					{
						System.out.print(arr[i]+" ");
					}
					//To remove the array duplicate
					int temp[]=new int[l];
					int index=0;
					for(int i=0;i<l-1;i++)
					{
						if(arr[i]!=arr[i+1])
						{
							temp[index++]=arr[i];
						}
					}
					temp[index++]=arr[l-1];
					System.out.println();
					System.out.println("\nArrayDuplicateRemoved");
					for(int i=0;i<index;i++)
					{
						System.out.print(temp[i]+" ");
					}
				}
	}



