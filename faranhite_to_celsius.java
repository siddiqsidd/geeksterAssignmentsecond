package jan31;
import java.util.*;
public class faranhite_to_celsius {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter fahrenheit");
		double Fahrenheit=s.nextDouble();
		double celsius=(Fahrenheit-32)*5/9;
		System.out.println(celsius);
	}

}
