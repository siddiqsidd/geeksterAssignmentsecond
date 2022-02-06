package jan31;
import java.util.*;
public class miutes_years_And_days {
	public static void main(String[] main) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  minutes");
		long min=s.nextLong();
		long minInyear=24*60*365;
		long years=(min/minInyear);
		long days=(int)(min/60/24)%365;
		System.out.println(min+"  minutes is equals to :  " + years+ "  years  :  " + days+"  days");
	}

}
