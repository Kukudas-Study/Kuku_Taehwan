import java.util.Scanner;
public class Main { 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N 받기
		int M = sc.nextInt(); //M 받기
		int[] bgn = new int[N]; //배열 길이 지정
		
		for(int i=0; i<N; i++) { //배열 [1,2,...,N]정의
			bgn[i] = i+1;
		}
		for(int i=0; i<M; i++) { //교환 횟수 지정
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			int temp = bgn[j-1];
			bgn[j-1] = bgn[k-1];
			bgn[k-1] = temp;
		}
		for(int i=0; i<N; i++) { //재배열된 배열 출력
			System.out.println(bgn[i]);
		}
	}
}
