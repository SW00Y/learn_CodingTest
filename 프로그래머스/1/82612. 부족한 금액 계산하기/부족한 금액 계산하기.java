class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sumprice =0;
        
        for(int i=1; i<=count; i++){
            sumprice += price * i;
        }

        if( money - sumprice < 0){
            return sumprice - money;
        }
        
        return 0;
    }
}