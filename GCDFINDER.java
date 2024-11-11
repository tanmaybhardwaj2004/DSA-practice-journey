package GCD;
import java.util.*;

public class GCDFINDER {
public int find(int a,int b)
{
	while(a!=0 && b!=0)
	{
		if(a>b)
			a=a%b;
		else
			b=b%a;
	}
	if(a==0)
		return b;
	else
		return a;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		GCDFINDER obj =new GCDFINDER();
		System.out.println(obj.find(a, b));
		sc.close();

	}

}
