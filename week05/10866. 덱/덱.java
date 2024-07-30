
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//스택 생성
		Deque<Integer> dq = new ArrayDeque<>();
		// String 토크나이져 생성
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			
			switch(a) {
			case "push_front":
				int c = Integer.parseInt(st.nextToken());
				dq.addFirst(c);
				break;
			case "push_back":
				int d = Integer.parseInt(st.nextToken());
				dq.addLast(d);
				break;
			case "pop_front":
				if(dq.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.removeFirst()+"\n");
				}break;
			case "pop_back":
				if(dq.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.removeLast()+"\n");
				}break;
			case "size":
				bw.write(dq.size()+"\n");
				break;
			case "empty":
				if(dq.isEmpty()) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}break;
			case "front":
				if(dq.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.element()+"\n");
				}break;
			case "back":
				if(dq.isEmpty()) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.getLast()+"\n");
				}break;
			}
			
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
