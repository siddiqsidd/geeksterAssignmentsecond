package feb_2;
import java.util.*;
public class feb2_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n1=s.nextInt();
		String result=(n1<10)? (n1>5? "greater than 5": "it is a smaller number") :"it is a greater number";
		System.out.println(result);
	}

}
