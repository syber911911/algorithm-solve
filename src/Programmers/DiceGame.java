package Programmers;
public class DiceGame {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;

        System.out.println(solution(a, b, c));
    }
    public static int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && a != c && b != c)
            answer = a + b + c;
        else if((a == b && a != c) || (a == c && a != b) || (b == c && a != b))
            answer = (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        else if(a == b && b == c)
            answer = (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        return answer;
    }
}
