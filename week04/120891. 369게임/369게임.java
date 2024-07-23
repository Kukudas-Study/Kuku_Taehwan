
class Solution {
    public int solution(int order) {
        int answer = 0;
        String word =""+order;
        for (int i=0; i<word.length(); i++) {
			int a = Integer.parseInt(String.valueOf(word.charAt(i)));
			
			if(a ==3||a==6||a==9) {
				answer++;
			}
        
        
        }return answer;
    }
}
