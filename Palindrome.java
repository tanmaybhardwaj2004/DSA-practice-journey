package PalindromeFunction;
import java.util.*;
public class Palindrome {

	public boolean p(int i,String s)
	{
		if(i==(s.length())/2)
		{
			return true;
		}
		if(s.charAt(i)!=s.charAt(s.length()-i-1))
			return false;
		return p(i+1,s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Palindrome obj=new Palindrome();
		System.out.println(obj.p(0, s));
		sc.close();

	}

}
