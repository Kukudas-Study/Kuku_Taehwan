import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		Arrays.sort(arr);
		
		for(int i =0; i<n; i++) { //배열 값 받기
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr); //배열 정렬
		System.out.println(arr[n-1-(k-1)]);//정렬된 배열 중 커트라인 찾기
	}
}
