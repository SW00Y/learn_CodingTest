import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        ArrayList<Integer> test = new ArrayList<>();

        for(int i =0; i<=9; i++)
        {
            test.add(i);
        }

        int answer = test.stream()
                .filter(num -> Arrays.stream(numbers).noneMatch(x -> x == num))
                .mapToInt(Integer::intValue)
                .sum();
        
        return answer;
    }
}