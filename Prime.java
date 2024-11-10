package PrimeNumber;

public class Prime {

	public String fun(int n)
	{
		int c=0;
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==1)
		{
			return "Prime";
		}
		else
		{
			return "Not Prime";
		}
	}
	public static void main(String[] args) {
	
		Prime obj= new Prime();
		System.out.print(obj.fun(119));

	}

}
