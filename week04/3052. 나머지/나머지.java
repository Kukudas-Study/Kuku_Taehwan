import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		int k =-1;
		
		for(int i =0; i<10; i++) {
			arr[i] = sc.nextInt()%42;
		}
		Arrays.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			if(k!=arr[i]) {
				k=arr[i];
				++count ;
			}
		}System.out.println(count);
		
		
	}
}