import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
		int a = -1;
		for(int i : arr) {
			if(a!=i) {
				arr1.add(i);
				a=i;
			}
		}
       int[] answer = new int[arr1.size()] ;
        for(int i =0; i< arr1.size();i++){
            answer[i] = arr1.get(i);
        }
        return answer;
          
     
    }
}