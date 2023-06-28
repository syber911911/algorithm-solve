package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TopSinger {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> topSinger = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
            topSinger.add(score[i]);
            if(i >= k){
                topSinger.sort(Comparator.naturalOrder());
                topSinger.remove(0);
            }
            topSinger.sort(Comparator.naturalOrder());
            answer[i] = topSinger.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        TopSinger topSinger = new TopSinger();
        int k = 3;
        int[] scores = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(Arrays.toString(topSinger.solution(k, scores)));
    }
}
