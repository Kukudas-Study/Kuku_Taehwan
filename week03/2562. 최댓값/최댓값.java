import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 0;
		for(int i=1; i<10; i++) {
			int a = sc.nextInt();
			
			if (max<a) {
				max = a;
				count = i;
			}
		}System.out.println(max); 
		 System.out.println(count); 
	}
}
