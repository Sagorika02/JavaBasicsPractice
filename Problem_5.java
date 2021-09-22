import java.util.Scanner;

public class Problem_5 {
	
	public int doubleDigits(int a) {
		if (a == 0) {
	        return 0;
	    } else {
	        int lastDigit = a % 10;
	        return 100 * doubleDigits(a / 10) + 10 * lastDigit + lastDigit;
	    }
	}

	public static void main(String[] args) {
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Problem_5 ob= new Problem_5();
		int result= ob.doubleDigits(n);
		System.out.print(result);
	}
}