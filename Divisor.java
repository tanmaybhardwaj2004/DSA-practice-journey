package DivisorFunction;
import java.util.*;
public class Divisor {
	List<Integer>list=new ArrayList<>();
	public void div(int n)
	{
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{	list.add(i);
				if((n/i)!=i)
				{
					list.add(n/i);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisor obj =new Divisor();
		obj.div(125);
	}

}
