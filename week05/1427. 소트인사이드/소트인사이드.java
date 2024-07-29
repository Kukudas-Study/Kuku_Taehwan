import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine(); //수를 문자열로 받음
		
		int[] arr = new int[word.length()];
		
		for(int i =0; i<word.length();i++) {
			arr[i]= Integer.parseInt(String.valueOf(word.charAt(i)));//문자열을 정수로 변환 후 대입
		}
		Arrays.sort(arr);//배열 정렬
		for(int i=0; i<arr.length/2;i++) {//정렬된 의 반만큼 재배열
			int tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = tmp;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
