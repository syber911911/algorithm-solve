package BaekJoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * int num: card 개수
 * int target: 맞추고 싶은 수
 * int result: 결과
 * int[] cards: 카드가 담긴 배열
 * */
public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int result = 0;
        int[] cards = new int[num];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 3장의 카드를 뽑기 때문에 num - 3 까지 반복
        for (int i = 0; i <= num - 3; i++) {
            // 이미 i index 의 카드는 선택 되었고 뒤에 한 장의 카드를 뽑기 때문에 그 다음 index 부터 num - 2 까지 반복
            for (int j = i + 1; j <= num - 2; j++) {
                // j index 의 카드 이후 끝까지 반복
                for (int k =  j + 1; k <= num - 1; k++) {
                    int sumOfCards = cards[i] + cards[j] + cards[k];
                    if (sumOfCards <= target && sumOfCards > result) result = sumOfCards;
                }
            }
        }
        System.out.println(result);
    }
}
