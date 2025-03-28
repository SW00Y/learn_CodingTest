import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int mini = Arrays.stream(arr).min().getAsInt();
        
        if(arr.length==1)
        {
            answer = new int[]{-1};
            return answer;
        }

        answer = Arrays.stream(arr).filter(i -> i != mini)
                .toArray();

        return answer;
    }
}