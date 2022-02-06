package jan31;
import java.util.*;
public class add_3_ascii {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 characters");
		char a=s.next().charAt(0);
		char b= s.next().charAt(0);
		char c=s.next().charAt(0);
		int asciin1=a;
		int ascii2=b;
		int ascii3=c;
		int sum=asciin1 +ascii2+ascii3;
		System.out.println(" sum of ascii values of  "+a+ " " +b+ " " +c+ " :"+sum );


	}

}
