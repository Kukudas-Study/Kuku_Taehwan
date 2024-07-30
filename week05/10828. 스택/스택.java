

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//스택 생성
		Stack<Integer> sta = new Stack<>();
		// String 토크나이져 생성
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			
			switch(a) {
			case "push":
				int c = Integer.parseInt(st.nextToken());
				sta.push(c);
				break;
			case "pop":
				if(sta.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(sta.pop()+"\n");
				}break;
			case "size" :
				bw.write(sta.size()+"\n");
				break;
			case "empty":
				if(sta.isEmpty()) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}break;
			case "top":
				if(sta.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(sta.lastElement()+"\n");
				}break;
			}
			
		}
		bw.flush();
		br.close();
		bw.close();
		
	}

}
