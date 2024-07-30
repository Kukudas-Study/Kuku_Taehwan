import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];//100x100 배열 선언
		int count =0;
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int w = sc.nextInt();//10x10 배열의 시작 점
			int h = sc.nextInt();
			for(int j =h;  j<10+h; j++) {
				for(int k =w; k<10+w; k++) {
					arr[j][k] =1;//10x10배열이 그려진 곳
				}
			}
		}
		for(int i =0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(arr[i][j]==1) {
					count ++;	
				}
			}
		}
		System.out.println(count);
	}

}
