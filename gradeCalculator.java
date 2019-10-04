/* Ryan Maidment
CST8110-312
Leanne Seaward
2018/10/05
Assignment 1
This program takes all your grades and calculates your total weighted grade. */


import java.text.DecimalFormat;
import java.util.Scanner;

public class gradeCalculator {

	public static void main(String[] args) {
	
Scanner input = new Scanner (System.in);

DecimalFormat df = new DecimalFormat("#.00");

	double labMark;
	double midMark;
	double finalMark;
	double testMark;
	double assignMark;
	
	System.out.println("Welcome to CST8110 Final Mark Calculator");
	
	System.out.println("Enter Lab Mark out of 10: ");
	labMark = input.nextDouble();
	
	System.out.println("Enter Quiz/Test mark out of 10: ");
	testMark = input.nextDouble();
	
	System.out.println("Enter Assignment mark out of 20: ");
	assignMark = input.nextDouble();
	
	System.out.println("Enter Midterm mark out of 20: ");
	midMark = input.nextDouble();
	
	System.out.println("Enter Final mark out of 40: ");
	finalMark = input.nextDouble();
	 
	double theory = (testMark*2+midMark*1.5+finalMark*1.25);
	double practical = (labMark*3.33+assignMark*3.33);
	double finalAvg = ((testMark)+(midMark)+(finalMark)+(assignMark)+(labMark));
	
	System.out.println("\tTheory:"+df.format(theory)+"%");
	System.out.println("\tPractical:"+df.format(practical)+"%");
	System.out.println("\tFinal:"+df.format(finalAvg)+"%");

}
}
