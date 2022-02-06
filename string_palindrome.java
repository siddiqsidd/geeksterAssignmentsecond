package jan31;
import java.util.*;
public class string_palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String input=s.nextLine();
		String temp="";
		for(int i=input.length()-1;i>=0;i--) {
			temp=temp+input.charAt(i);
		}
		System.out.println("reverse string is : ");
		System.out.println(temp);
		if(input.equals(temp)) {
		 System.out.println("given string is palindrome");
		}
		else {
		System.out.println("not a palindrome");
		}
	}

}
