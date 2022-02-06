package feb_2;
import java.util.*;
public class feb24th {
			public static void mian(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter the number of month to know the name of month");
				int number=s.nextInt();
				if(number==1)
					System.out.println("January");
				else if(number==2)
					System.out.println("February");
				else if(number==3)
					System.out.println("March");
				else if(number==4)
					System.out.println("April");
				else if(number==5)
					System.out.println("May");
				else if(number==6)
					System.out.println("June");
				else if(number==7)
					System.out.println("July");
				else if(number==8)
					System.out.println("August");
				else if(number==9)
					System.out.println("Swptember");
				else if(number==10)
					System.out.println("October");
				else if(number==11)
					System.out.println("November");
				else if(number==12)
					System.out.println("December");
				else
					System.out.println("please enter a valid number");
			}
}




