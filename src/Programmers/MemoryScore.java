package Programmers;

import java.util.Arrays;

public class MemoryScore {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int index = 0;
        for(String[] persons : photo){
            for(String person : persons){
                if(Arrays.asList(name).indexOf(person) != -1) {
                    answer[index] += yearning[Arrays.asList(name).indexOf(person)];
                }
            }
            index++;
        }
        return answer;
    }
}
