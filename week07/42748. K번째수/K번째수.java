import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
class Solution { 
    public int[] solution(int[] array, int[][] commands) {     
        
        List<Integer> li=new ArrayList<>();
		
		
		for(int i=0; i<commands.length; i++) {
				int[] arrcopy = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
				Arrays.sort(arrcopy);
				li.add(arrcopy[commands[i][2]-1]);

		}
        int[] answer = new int[li.size()];
        for(int i = 0; i<li.size(); i++) {
            answer[i] = li.get(i);
        }
        
        return answer;
    }
}
