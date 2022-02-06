package jan31;
import java.util.*;
public class revereString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name of city");
		String cityname=s.nextLine();
		String reversename="";
		for(int i=cityname.length()-1;i>=0;i--) {
			reversename+=cityname.charAt(i);
		}
		System.out.println(reversename);
	}

}
