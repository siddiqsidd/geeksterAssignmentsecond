package jan31;
import java.util.*;
public class inches_meter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter inches");
		double inches=s.nextDouble();
		double meter=inches * 0.0254;
		System.out.println(meter+"m");
	}

}
