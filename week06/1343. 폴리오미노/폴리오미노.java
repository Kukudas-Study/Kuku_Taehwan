import java.io.IOException;
import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);		
		
//		String N = sc.nextLine().replace("XXXX", "AAAA").replace("XX", "BB");
//		if(N.contains("X")) {
//			N="-1";
//		}
		String N = sc.nextLine();
		for(int i=0; i<N.length(); i++) {
			if(N.contains("XXXX") || N.contains("XX")) {
				N =N.replace("XXXX", "AAAA");
				N =N.replace("XX", "BB");
			}
		}	
		
		if(N.contains("X")) {
			N="-1";
		}
		System.out.println(N);
		
	}

}
