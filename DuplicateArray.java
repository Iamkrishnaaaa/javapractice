package ksr.com.array;
import java.util.Arrays;
public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,2,6,3,8};
	    Arrays.sort(arr); //122334568
	    int[] temp=new int[arr.length];
	    int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
			
		}
		temp[j++]=arr[arr.length-1];
		for(int i=0;i<j;i++) //here j known how many values are there in new revoved array;
		{
			System.out.print(temp[i]);
		}
	}
}
