import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] subject = new double[sc.nextInt()];
		
		double max=0;
		double sum=0;
		
		for(int i=0; i<subject.length; i++) {		
			subject[i]=sc.nextInt();
			if(max<subject[i]) {
				max=subject[i];	
			}
			
		}
		for (int i=0; i<subject.length; i++) {
			sum += subject[i]/max*100;
		}
		double avg = sum/subject.length;
		System.out.println(avg);
	}
}
