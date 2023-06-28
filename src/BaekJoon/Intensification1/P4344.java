package BaekJoon.Intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] scoreArr;
        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            scoreArr = new int[studentNum];
            int total = 0;
            for (int j = 0; j < studentNum; j++) {
                int val = Integer.parseInt(st.nextToken());
                total += val;
                scoreArr[j] = val;
            }

            int avg = total / studentNum;
            int count = 0;
            for (int j = 0; j < studentNum; j++) {
                if (scoreArr[j] > avg) count++;
            }
            System.out.printf("%.3f%%\n", (count / (double)studentNum) * 100);
        }
    }
}
