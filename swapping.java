package feb4;
import java.util.*;
public class swapping {
	public static void mian(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 number to swap :");
		int n1=s.nextInt();//6
		int n2=s.nextInt();//8
		int temp=0;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("swapped numbers are : " +n1+ " "+n2);
		int a=6,b=8;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+ " " +b);
		
	}

}
