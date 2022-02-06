package feb4;
import java.util.*;
public class three_sum {
	public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);
		System.out.println("enter a 3 digit number");
		int n=s.nextInt();//123
		int sum=0;int rem;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n/=10;		
		}
		System.out.println(sum);
		
	}

}
