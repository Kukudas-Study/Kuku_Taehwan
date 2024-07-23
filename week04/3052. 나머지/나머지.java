import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0; //다른 값 개수
		int k =-1; 	
		
		for(int i =0; i<10; i++) {//42로 나눈 나머지 배열
			arr[i] = sc.nextInt()%42;
		}
		Arrays.sort(arr);//최댓값 비교로 다른 수를 찾기 위해 오름차순정렬
		for(int i = 0; i<arr.length; i++) {
			if(k!=arr[i]) {
				k=arr[i];
				++count ;
			}
		}System.out.println(count);
		
		
	}
}
