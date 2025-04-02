package ksr.com.forloop;

public class PrimeMultiple {
		public static void main(String[] args) {
			int num=100;
			int flag=0;
			int temp[]=new int[num];
			int Index=1;
			int n=5,m=10;
			for(int i=2;i<=num;i++)
			{
				flag=0;
				for(int j=2;j*j<=i;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
				  temp[Index++]=i;	
				}
			}
			System.out.println("To Multiple "+n+"th prime and "+m+"th prime number.");
			System.out.println(temp[n]+" x "+temp[m]+" :"+temp[n]*temp[m]);
			
		}
}
