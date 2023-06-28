package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorization {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }
    //array나 list가 아닌 중복을 허용하지 않는 linkedhashset이나 set을 사용하는 것도 고려
    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> array = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            while(n % i == 0 ){
                if(array.contains(i) == false){
                    array.add(i);
                    n /= i;
                }
                else{
                    n /= i;
                }
            }
        }
        answer = new int[array.size()];
        for(int i = 0; i < array.size(); i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}
