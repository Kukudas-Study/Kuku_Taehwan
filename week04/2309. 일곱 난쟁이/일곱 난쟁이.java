import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9]; //9명의 난쟁이
		int sum = 0; //난쟁이들 총 합
		int a = 0; int b = 0; //범인 색출
		
		
		
		for(int i =0; i<9; i++) {//난쟁이 키 넣어주기
			arr[i]= sc.nextInt();
			sum = sum+arr[i];
		}
		Arrays.sort(arr);//a와 b를 index로 잡아주기에 오름차순으로 변경
		for(int i =0; i<9; i++) {
			for(int j =0; j<9; j++) {
				if(sum - arr[i]-arr[j] == 100) {
					a = i;
					b = j;
					
				}
			}
		}
		for(int i =0; i<9; i++) {
			if(i ==a || i==b) {//범인이 나오면 지나가고 다시 반복
				continue;
			
			}Arrays.sort(arr);
			System.out.println(arr[i]);
		

	}

	}
}
