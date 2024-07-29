import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		int[] arr = new int[word.length()];
		
		for(int i =0; i<word.length();i++) {
			arr[i]= Integer.parseInt(String.valueOf(word.charAt(i)));
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length/2;i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = tmp;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}