package feb_1;
import java.util.*;
public class feb1_3rd_question {
	public static int evennumber(int num) {
		if(num%2==0) {
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");
		return num;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("eter a number");
		int num=s.nextInt();
		int even=evennumber(num);
	}

}
