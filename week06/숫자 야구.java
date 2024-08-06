package week5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> sta = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());  // 민혁이의 질문 횟수	
		
		
		
		for(int j=1; j<10; j++) {
			for(int k=1; k<10;k++) {
				for(int i=1; i<10;i++) {
					if(i!=j && j!=k && i!=k) {//겹치지 않는 세자리수
						sta.add(""+j+k+i);
					}
		
				}
			}
		}
		System.out.println(sta);
		
		for(int i =0; i<c; i++) {
			int count =0;
			st = new StringTokenizer(br.readLine(), " "); // 123 1 1
			String a= st.nextToken();
			String s= st.nextToken();
			String b= st.nextToken();
			for(int j=0; j<sta.size(); j++) {
				for(int k=0;k<3;k++) {
					for(int l=0; l<3;l++) {
						if(Integer.parseInt(s)==1) {
							if(sta.get(j).charAt(0)==a.charAt(0)&&sta.get(j).charAt(1)==a.charAt(1) ||
									sta.get(j).charAt(0)==a.charAt(0)&&sta.get(j).charAt(2)==a.charAt(2)||
									sta.get(j).charAt(1)==a.charAt(1)&&sta.get(j).charAt(2)==a.charAt(2)) {
								sta.remove(j);
							}
							
						}
//						else if(Integer.parseInt(s)==2) {
//							if(sta.get(j).charAt(i))
//						}
					}
				}
			}System.out.println(sta);
			
		
			
		}
	}

}
