import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0; 
			while (i < n) {
				System.out.println(" ".repeat(n - (i + 1)) + "*".repeat(n - (n - (i + 1))));
				i++;
			}
			System.out.println();
	}

}
