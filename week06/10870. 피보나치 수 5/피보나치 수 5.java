import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int a = 1;
		int b = 0;
		for (int i = 0; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println(sum);
	}

}
