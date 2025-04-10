class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i< number.length; i++)
        {
            for(int y = i+1; y<number.length; y++)
            {
                for(int z = y+1; z<number.length;z++)
                {

                    if(number[i] + number[y] + number[z] ==0)
                    {
                        answer = answer +1;
                    }

                }
            }

        }
        return answer;
    }
}