class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b)
        {
            return a;
        }
        
        if(a>b)
        {
            int swap = a;
            a = b;
            b = swap;
        }
        for(int i=a; i<=b;i++)
        {
            answer = answer + i;
        }
        return answer;
    }
}