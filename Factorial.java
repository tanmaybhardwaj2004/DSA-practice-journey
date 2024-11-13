package RecursionFactorial;
import java.util.*;


public class Factorial {

	public int fact(int f)
	{
		if(f==0||f==1)
		{
			return 1;
		}
		return f * fact(f-1);
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Factorial obj=new Factorial();
		int a=sc.nextInt();
		System.out.println(obj.fact(a));
		sc.close();

	}

}
