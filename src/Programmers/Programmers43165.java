package Programmers;

public class Programmers43165 {
    // 재귀함수 DFS 를 할 예정이기에, answer 를 class 단위에서 관리
    private int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    // 재귀함수 DFS
    public void dfs(
            // 내가 사용할 숫자들
            int[] numbers,
            // 내가 다음에 사용할 차례의 숫자
            // 이번 DFS 호출에서 더하거나 빼거나 할 숫자는 numbers[next]
            int next,
            // 목표 값
            int target,
            // 현재 재귀 호출까지 합한 값
            int sum
    ) {
        if (next == numbers.length) {
            if (sum == target) this.answer++;
        } else {
            dfs(numbers, next + 1, target, sum + numbers[next]);
            dfs(numbers, next + 1, target, sum - numbers[next]);
        }
    }

    public static void main(String[] args) {
        int answer = new Programmers43165().solution(new int[]{4, 1, 2, 1}, 4);
        System.out.println(answer);
    }
}
