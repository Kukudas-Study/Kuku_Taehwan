class Solution {
    static int answer =0;
    public int solution(int a, int b, int n) {

        
        return cola(a,b,n);
    }
    public static int cola(int a,int b,int n){
        if(n<a){
            return answer;
        }
        answer += n/a*b;
        n = n/a*b + n%a;
        return cola(a,b,n);
    }
}
