package ksr.com.whileloop;

public class Palindrome {
	public static void main(String[] args) {
		String s="level";
		char[] arr=s.toCharArray();
		int l=0;//left
		int r=s.length()-1;//right last index
		while(l<r)
		{
			char temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		String reverse=new String(arr);//Here we use new string(arr)=which converts back the array into string, back it stores in string pool()non constant direct heap
		//and converting to pool space by storing it by giving String type without using new keyword.
		
		if(reverse.equals(s))//here comes why we are using equals()method insted of == because in string pool the both revese and s obj points the single value which is
			//level so there is no comparison 
		{
			System.out.println(reverse+" :is palindrome");
		}
		else
			System.out.println(reverse+" :is not a palindrome");
}
}
