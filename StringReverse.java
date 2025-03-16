package ksr.com.forloop;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("String reverse: "+reverse);
		sc.close();
	}
}
