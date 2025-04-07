class Solution {
    public int[] solution(int n, int m) {
        int num = calculateNumber(n, m);
        int[] answer = {num, (n * m) / num};

        return answer;

    }

    public static int calculateNumber(int n, int m) {
        if (n % m == 0) {
            return m;
        }
        return calculateNumber(m, n%m);
    }
}