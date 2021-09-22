import java.util.Scanner;

public class Problem_2 {

	// Function to match the given month and return its maximum days
	int findMaxDay(int month, int y) {
		String months[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int D[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
			D[2] = 29;
		}
		int max = 0;
		max = D[month]; // Saving maximum day of given month
		return max;
	}

	// Function for creating the calendar
	void fillCalendar(int max, int f, int monthno, int y) {
		int A[][] = new int[6][7];
		int x = 1, z = f;

		for (int i = 0; i < 6; i++) {
			for (int j = f; j < 7; j++) {
				if (x <= max) {
					A[i][j] = x;
					x++;
				}
			}
			f = 0;
		}

		for (int j = 0; j < z; j++) // Adjustment to bring last (6th) row
									// elements to first row
		{
			A[0][j] = A[5][j];
		}
		String months[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		printCalendar(A, months[monthno], y); // Calling function to print the
										// calendar
	}

	// Function for printing the calendar
	void printCalendar(int A[][], String monthName, int y) {
		System.out.println("\n\t----------------------------------------------------");
		System.out.println("\t\t\t   " + monthName + " " + y);
		System.out.println("\t----------------------------------------------------");
		System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		System.out.println("\t----------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (A[i][j] != 0)
					System.out.print("\t " + A[i][j]);
				else
					System.out.print("\t ");
			}
			System.out.println("\n\t----------------------------------------------------");
		}
	}

	public static void main(String args[]) {
		Problem_2 ob = new Problem_2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int y = sc.nextInt();
		System.out.print("Enter the month name (e.g. 1 for Jan....) : ");
		int month = sc.nextInt();
		System.out.print("Enter day of week (e.g. 1 for Mon, 7 for Sunday....) : ");
		int week = sc.nextInt();

		int max = ob.findMaxDay(month, y);
		
		ob.fillCalendar(max, week, month, y);
	}
}