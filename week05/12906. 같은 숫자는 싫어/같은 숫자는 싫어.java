import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(); 
		int a = -1; //첫 줄 실행 위한 변수 정의
		for(int i : arr) {
			if(a!=i) {
				arr1.add(i);//연속이 되지 않을 때 추가
				a=i;
			}
		}
       int[] answer = new int[arr1.size()] ; 
        for(int i =0; i< arr1.size();i++){
            answer[i] = arr1.get(i);//arr1 인덱스값 answer 배열에 추가
        }
        return answer;
          
     
    }
}
