import java.util.Scanner;

public class Problem_3 {
	
	public void square() {
		
		System.out.println("Enter side of square: ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		System.out.print("Area of square fence for chickens is "+s*s);
	}
	
	public void circle() {
		
		System.out.println("Enter radius of circle");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.print("Area of circular fence for ducks is "+Math.PI*r*r);
	}

	public void Rect() {
		
		System.out.println("Enter length of rectangle: ");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		
		System.out.println("Enter breadth of rectangle: ");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		
		System.out.print("Area of rectangular fence for cows is "+l*b);
	}

	public static void main(String[] args) {
		
		System.out.println("Select an option from list to calculate area of fence \r\n"
				        + "1. Square area for the chickens    \r\n"
						+ "2. Circular area for ducks    \r\n"
						+ "3. Rectangular area for cows ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Problem_3 ob =new Problem_3();
		switch(num) {
		case 1: ob.square();
		break;
		case 2: ob.circle();
		break;
		case 3: ob.Rect();
		break;
		default:System.out.println("-----Wrong Input-----");
		}
	}
}
