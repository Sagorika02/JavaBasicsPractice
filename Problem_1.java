import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		
		System.out.print("Number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2=0;
		int arr[] = new int[50];
		int len=0;
		int j=0;
		
		while(num!=0) {
			arr[j]=num%10;
			num=num/10;
			len++;
			j++;
		}
		
		if(len%2==0) {
			for(int i=len-1;i>=0;i=i-2) {
				arr[i]=arr[i]+arr[i-1];
				arr[i-1]= arr[i]-arr[i-1];
				arr[i]=arr[i]-arr[i-1];
			}
		}
		else {
			for(int i=len-2;i>=0;i=i-2) {
				arr[i]=arr[i]+arr[i-1];
				arr[i-1]= arr[i]-arr[i-1];
				arr[i]=arr[i]-arr[i-1];
			}
		}
		
		for(int k=len-1;k>=0;k--) {
			num2=num2*10+arr[k];
		}
		System.out.print("Swapped Number: "+num2);
	}
}