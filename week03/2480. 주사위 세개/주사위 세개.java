import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int a;
		
		
		if (num1 == num2 && num2 ==num3) {
			a = 10000+(num1*1000);
		}else if(num1 == num2 || num1 == num3) {
			a = 1000+(num1*100);
		}else if(num2 == num3){
			a = 1000+(num2*100);
		}else {
			if(num1>num2 && num1>num3) {
				a = num1*100;
			}else if(num2 > num1 && num2 > num3) {
				a = num2*100;
			}else {
				a = num3*100;
			}
		}System.out.println(a);


}
}