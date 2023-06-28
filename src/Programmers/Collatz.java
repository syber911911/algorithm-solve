package Programmers;

public class Collatz {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;

        for (int i = 0; i <= 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        System.out.println(collatz.solution(6));
        System.out.println(collatz.solution(16));
        System.out.println(collatz.solution(626331));
    }
}
