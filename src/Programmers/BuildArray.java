package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        System.out.println(Arrays.toString(solution(5, 555)));
    }
    public static int[] solution(int l, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] answer = {};
        for(int i = l; i <= r; i++){
            if(checkZeroOrFive(i)) temp.add(i);
        }
        if(temp.size() == 0) answer = new int[] {-1};
        else {
            answer = new int[temp.size()];
            for(int i = 0; i < temp.size(); i++) {
                answer[i] = temp.get(i);
            }
        }
        return answer;
    }

    public static boolean checkZeroOrFive(int i) {
        while(i != 0) {
            if(i % 10 == 0 || i % 10 == 5) i /= 10;
            else return false;
        }
        return true;
    }
}
