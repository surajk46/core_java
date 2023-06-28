package p5_practice;
import java.util.*;
public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sk=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sk.next();
		StringOperations s1=new Stringss();
		s1.reverse(str);
		s1.toUpperCase(str);
		System.out.println("Length of "+str+" = "+s1.length(str));
		boolean f=s1.isPallindrome(str);
		if(f==true)
		System.out.println(str+" Is Palindrome ");
		else
			System.out.println(str+" Is NOT Palindrome ");
		System.out.println(s1.append(str,"newstr"));
		
	}

}
