import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int c =1;
		
		for(int i=0; i<a.length()/2; i++) {
			if(a.charAt(i) == a.charAt(a.length()-1-i)) {
				continue;	
			}else {
				c = 0;
				break;
			}
		}System.out.println(c);
	}
}
