package feb4;
//The total number of students in a class are 90 out of which 45 are boys. 
//If 50% of the total students secured grade 'A' out of which 20 are boys,
//then write a program to calculate the total number of girls getting grade 'A'.
public class grade {
	public static void main(String[] args) {
		int totalnumber=90;
		int boys=45;
		int girls=90-45;
		int boysgradeA=20;
		double totalAgrade=90*0.5;
		double girlsGradeA=totalAgrade-boysgradeA;
		System.out.println("total number of girls getting A grade is :  "+girlsGradeA);
		
	}

}
