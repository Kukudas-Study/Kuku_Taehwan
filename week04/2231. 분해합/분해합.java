import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a =0, b =0;
		
		for(int i = 1; i<=N; i++) {
			a=i;
			b=i;
			while(b != 0) {
				int t = b%10;
				a = a +t;
				b = b/10;
			}
			if(a == N) {
				a = i;
				break;
			}else {
				a=0;
			}
		}
		System.out.println(a);
		
	}
}