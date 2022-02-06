package feb4;
import java.util.*;
public class first_last2nd {
	public static int first(int input) {
		while(input >=10) {
			input=input/10;
		}
		return input;
	}
	public static int lasttwo(int temp) {
		int last2nd=(temp/10)%10;
		return last2nd;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int input=s.nextInt();
		int firsrinput=first(input);
		int temp=0; temp=input;
		int last2nd=lasttwo(temp);
		int sum=firsrinput+last2nd;
		System.out.println("first number is : "+firsrinput+ ", last second  number is : "+last2nd+ " and sum is : "+sum);
		
	}

}
