import java.util.Scanner;

public class Problem_6 {

	public static void main(String[] args) {
		
		System.out.print("Enter ph value of water:");
		Scanner sc = new Scanner(System.in);
		int ph = sc.nextInt();
		
		if(ph<7) {
			System.out.println("pH value is low, partial water change required");
		}
		
		else if(ph==7 || ph==8) {
			System.out.println("pH value is fine");
		}
		
		else {
			System.out.println("pH value is high, partial water change required");
		}
	}
}