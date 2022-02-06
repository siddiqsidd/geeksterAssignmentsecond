package feb_2;
import java.util.*;
public class feb2Lastquestion {
	public static void mian(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=s.next().charAt(0);
		String result=(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U')? "characte is vovel" : "charecter is constant";
		System.out.println(result);
	}
}
