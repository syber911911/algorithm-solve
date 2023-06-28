package BaekJoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int loopSize = Integer.parseInt(st.nextToken());
        int[] space = new int[size];
        // 자신의 바구니 번호에 맞는 숫자 set
        for (int i = 0; i < size; i++) {
            space[i] = i + 1;
        }

        for (int i = 0; i < loopSize; i++) {
            st = new StringTokenizer(br.readLine());
            int target1 = Integer.parseInt(st.nextToken());
            int target2 = Integer.parseInt(st.nextToken());

            int temp = space[target1 - 1];
            space[target1 - 1] = space[target2 - 1];
            space[target2 - 1] = temp;
        }
        for (int item : space) {
            System.out.print(item);
            System.out.print(" ");
        }
    }
}
