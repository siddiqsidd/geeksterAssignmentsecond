package feb_1;
import java.util.*;
public class feb1_1st_question {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		String input=s.nextLine();int count=0;
		for(int i=0;i<=input.length()-1;i++) {
			count=count+1;
		}
		System.out.println("total digits entered by users is  : "+ count);
		
	}
}
