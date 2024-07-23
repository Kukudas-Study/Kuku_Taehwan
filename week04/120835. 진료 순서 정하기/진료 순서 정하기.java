class Solution {
    public int[] solution(int[] emergency) {
        int[] arr2 = new int[emergency.length]; // 주어진 배열
        for(int i =0; i<emergency.length; i++) { //for문 두 개를 이용한 비교
			int count =0;		//진료순서 count
			for(int j = 0; j<emergency.length; j++) {d
				if(emergency[i]<emergency[j]) {
					count++;
					arr2[i] = count;
				}
			}arr2[i]++; // 진료순서 1씩 추가
        }
        return arr2;
    }
}
