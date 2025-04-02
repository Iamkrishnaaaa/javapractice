package ksr.com.array;
import java.util.Arrays;
public class ArrayAdd {
	public static void main(String[] args) {
		int[] arr1= {1,2,5,7};
		int[] arr2= {2,3,5,6,7,8};
		int[] mergedArray=new int[arr1.length + arr2.length];
		int index=0;//index value which is used to store the value according to the incerement order.
		for(int num:arr1)//here array1  stores in the num one by one according to their increment index.
		{
			mergedArray[index++]=num;
		}
		for(int num:arr2)
		{
			mergedArray[index++]=num;
		}
		Arrays.sort(mergedArray);	
		int temp[]=new int[mergedArray.length];
		int index2=0;
		
		for(int i=0;i<mergedArray.length-1;i++)
		{
			if(mergedArray[i]!=mergedArray[i+1])
			{
				temp[index2++]=mergedArray[i];
			}
		}
		 temp[index2++]=mergedArray[mergedArray.length-1];
		 System.out.println("Removed duplicate elements in the array:");
		 for(int i=0;i<index2;i++)
		 {
			
			 System.out.print(temp[i]+" ");
		 }
		}
	}
//NOTE:
//System.out.println(Arrays.toString(mergedArray));//here we using the Arrays.toStirng() method to
//convert the readable array format which displays the actual value insted of displaying memory adress.
