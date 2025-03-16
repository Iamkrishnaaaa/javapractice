package ksr.com.forloop;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n=100;
		int flag=1;
		System.out.println("Prime numbers upto: "+n+"\n");
		for(int i=2;i<=n;i++)
		{
			flag=1;
			for(int j=2;j*j<=i;j++){
				{
					if(i%j==0)
					{
						flag=0;
						break;
					}
				}
				
			}
			if(flag==1)
				
				System.out.println("Prime numbers: "+i);
		}
	}
}
