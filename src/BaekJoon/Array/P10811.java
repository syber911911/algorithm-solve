package BaekJoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int loopSize = Integer.parseInt(st.nextToken());
        int[] space = new int[size];

        for (int i = 0; i < size; i++) {
            space[i] = i + 1;
        }

        for (int i = 0; i < loopSize; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            while (start < end) {
                int temp = space[start];
                space[start++] = space[end];
                space[end--] = temp;
            }
        }
        for (int item : space) {
            System.out.print(item);
            System.out.print(" ");
        }
    }
}
