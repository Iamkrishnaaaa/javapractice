package ksr.com.forloop;

public class GreatestNum {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int N=arr.length;
		
		for(int i=0;i<N-1;i++)
		{
			for(int j=0;j<N-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
