import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int[] bgn = new int[N];
	        
	        for(int i=0; i<M; i++) {
	        	int A = sc.nextInt();
	        	int B = sc.nextInt();
	        	int C = sc.nextInt();
	        	for(int j = A-1; j<B;  j++) {
	        		bgn[j]=C;
	        	}
	        }for (int i =0; i<bgn.length; i++) {
	        	System.out.println(bgn[i]);
	        }
	        
	        
	    }

}