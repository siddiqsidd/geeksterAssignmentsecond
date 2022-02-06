package feb_1;
import java.util.*;
public class feb1_2nd_question {
	public static int factorialnumber(int n1) {
		int fact=1;
		for(int i=n1;i>0;i--) {
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.println("enter a number");
		int n1=s.nextInt();
		System.out.println("print yes if you want to run the program");
		Scanner sc= new Scanner(System.in);
		String userwish=sc.nextLine();
		String check="yes";

		int number=factorialnumber(n1);
		if(userwish.equals(check)) {
			System.out.println("the factorial of a number  "+n1+ " is  : ");
			System.out.println(number);
		}


	}

}
