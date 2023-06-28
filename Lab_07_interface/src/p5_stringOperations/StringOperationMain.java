package p5_stringOperations;

import java.util.Scanner;

public class StringOperationMain {

	public static void main(String[] args) {
		Scanner sk=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sk.next();
		StringOperations s1=new Strings();
		s1.reverse(str);
		s1.toUpperCase(str);
		System.out.println("Length of "+str+" = "+s1.length(str));
		boolean f=s1.isPallindrome(str);
		if(f==true)
		System.out.println(str+" Is Palindrome ");
		else
			System.out.println(str+" Is NOT Palindrome ");
		System.out.println(s1.append("Akash","Bodkhe"));
		
	}

}
