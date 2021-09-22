import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		
		System.out.print("Enter name of the employee:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("Enter base pay of the employee:");
		Scanner sc1 = new Scanner(System.in);
		double b = sc1.nextDouble();
		
		System.out.print("Enter number of hours worked by the employee:");
		Scanner sc2 = new Scanner(System.in);
		int h = sc2.nextInt();
		
		double total;
		
		if(b>=12) {
			if(h>40) {
				total= b*40 + (h-40)*b*2;
			}
			else {
				total= b*h;
			}	
		}
		else {
			total=0;
		}
		System.out.println("\n Name::"+name+"\n Base Pay::"+b+"$"+"\n Hours worked::"+h
				+ "\n Salary of the Employee::"+total+"$");
	}
		
}
