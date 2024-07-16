import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int h = 0;
		int m = 0;
		h = A+(B+C)/60;
		if(h>=24) {
			h= h-24;
		}
		m = (B+C)%60;
		System.out.println(h + " " + m);
	}

}
