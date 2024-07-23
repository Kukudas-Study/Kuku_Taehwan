class Solution {
    public int solution(int[] numbers, int k) {
        int b = 1;
        for(int i =0; i<k-1; i++){
            b = b+2 ;
            if(b>numbers.length){
                b = b%numbers.length;
            }
        }
        
        return b;
    }
}