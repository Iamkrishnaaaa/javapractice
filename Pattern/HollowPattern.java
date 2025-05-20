package ksr.com.Pattern;

public class HollowPattern {
		public static void hollowPattern(int n)
		{
			for(int i=0;i<n;i++)//i loop handles the row (------)[n==6]
			{
				for(int j=0;j<n;j++)//j loop handles the column(||||||)[n=6]
				{
					if(i==0||j==0||i==n-1||j==n-1)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			int n=6;
			hollowPattern(n);
		}
}
