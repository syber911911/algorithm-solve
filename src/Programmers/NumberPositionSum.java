package Programmers;

public class NumberPositionSum {
    public static void main(String[] args) {
        System.out.println(solution(687));
    }
    public static int solution(int n) {
        int answer = 0;

        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
