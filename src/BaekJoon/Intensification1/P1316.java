package BaekJoon.Intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopSize = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < loopSize; i++) {
            boolean[] charArr = new boolean[26];
            String inputStr = br.readLine();
            boolean check = true;
            charArr[inputStr.charAt(0) - 'a'] = true;
            for (int j = 1; j < inputStr.length(); j++) {
                char c = inputStr.charAt(j);
                if (c != inputStr.charAt(j - 1) && charArr[c - 'a']) {
                    check = false;
                }
                charArr[c - 'a'] = true;
            }
            if(check) count++;
        }
        System.out.println(count);
    }
}
