package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers43163 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        // words 내에 target 이 존재하지 않으면 바로 반환
        if (!Arrays.asList(words).contains(target)) return answer;

        // 최단거리를 구하기 위함
        // 사용했던 단어를 다시 사용할 경우 최단거리에서 최소 +2 만큼 벌어진다
        boolean[] visited = new boolean[words.length];
        // 거리를 저장하기 위한 distance 배열
        // begin 에서 words[i] 까지 도달하는데 걸린 최소 변환 횟수
        int[] distance = new int [words.length];

        // begin 에서 일단 도달할 수 있는 words 내의 단어를 Queue 에 저장
        Queue<Integer> toVisit = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            // 시작 단어와 유사한 단어일 경우
            if (similar(begin, words[i])) {
                toVisit.offer(i);
                visited[i] = true;
                distance[i] = 1;
            }
        }
        while (!toVisit.isEmpty()) {
            int nextIdx = toVisit.poll();
            String nextWord = words[nextIdx];
            if (nextWord.equals(target)) {
                answer = distance[nextIdx];
                break;
            }
            // 다음 방문 대상 선정
            for (int i = 0; i < words.length; i++) {
                if (similar(nextWord, words[i]) && !visited[i]) {
                    toVisit.offer(i);
                    visited[i] = true;
                    distance[i] = distance[nextIdx] + 1;
                }
            }
        }
        return answer;
    }

    // 인접 판단 메서드
    // 두 단어가 한 글자를 제외하고 동일한지
    private boolean similar(String word, String target) {
        int k = 0; // 몇개의 글자가 일치하는지 저장
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target.charAt(i)) k++;
        }
        return k == word.length() - 1;
    }

    public static void main(String[] args) {
        System.out.println(
                new Programmers43163().solution("hit", "cog", new String[]{
                        "hot", "dot", "dog", "lot", "log", "cog"
                })
        );
        System.out.println(
                new Programmers43163().solution("hit", "cog", new String[]{
                        "hot", "dot", "dog", "lot", "log"
                })
        );
    }
}
