
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 버퍼리더 생성 (인풋 스트림리더 (시스템 인))
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 큐 생성
		Queue<Integer> qu = new LinkedList<>();
		// String 토크나이져 생성
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int qq = 0;
		int o = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();

			switch (a) {
			case "push":
				int c = Integer.parseInt(st.nextToken());
				qu.add(c);
				qq = c;
				break;

			case "pop":
				if (qu.size() == 0) {
					bw.write(-1+"\n"); 
				} else {
					bw.write(qu.poll()+"\n");
				}
				break;
			case "front":
				if (qu.size() == 0) {
					bw.write(-1+"\n");
				} else {
					bw.write(qu.element()+"\n");
				}
				break;
			case "size":
				bw.write(qu.size()+"\n");
				break;
			case "empty":
				if (qu.size() == 0) {
					bw.write(1+"\n");
				} else {
					bw.write(0+"\n");
				}
				break;
			case "back":
				if (qu.size() == 0) {
					bw.write(-1+"\n");

				} else {
					bw.write(qq+"\n");
				}
				break;

			}
		
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
