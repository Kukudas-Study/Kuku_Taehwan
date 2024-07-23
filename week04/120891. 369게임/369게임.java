
class Solution {
    public int solution(int order) {
        int answer = 0;
        String word =""+order; //charAt을 쓰기 위해 문자열로 받음
        for (int i=0; i<word.length(); i++) { //길이만큼 반복
			int a = Integer.parseInt(String.valueOf(word.charAt(i)));
			
			if(a ==3||a==6||a==9) {//3,6,9 가 나올 때마다
				answer++;	// 박수 추가
			}
        
        
        }return answer;
    }
}
