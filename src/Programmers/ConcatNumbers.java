package Programmers;

public class ConcatNumbers {
    public static void main(String[] args) {
        int[] arr ={3, 4, 5, 2, 1};
        System.out.println(solution(arr));
    }
    public static int solution(int[] num_list) {
        int answer = 0;
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                evenSum *= 10;
                evenSum += num_list[i];
            } else {
                oddSum *= 10;
                oddSum += num_list[i];
            }
        }
        answer = oddSum + evenSum;
        return answer;
    }
}
