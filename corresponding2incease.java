package feb4;
import java.util.*;
public class corresponding2incease {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int temp=0; int rem=0; int sum=0;int n2=0;
			while(n>0) {
			rem=n%10;
			n2=(rem+2)%10;
			sum=sum*10+n2;
			n/=10;
			
		}
			//System.out.println(sum);
			int num=sum; int rem2=0; int lastanswer=0;
			while(num>0) {
				rem2=num%10;
				lastanswer=lastanswer*10+rem2;
				num/=10;
			}
			System.out.println(lastanswer);
	}

}
