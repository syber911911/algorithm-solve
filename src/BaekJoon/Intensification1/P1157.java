package BaekJoon.Intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int[] charIndex = new int[26];

        for (int i = 0; i < inputStr.length(); i++) {
            if('A' <= inputStr.charAt(i) && inputStr.charAt(i) <= 'Z') charIndex[inputStr.charAt(i) - 'A']++;
            else charIndex[inputStr.charAt(i) - 'a']++;
        }

        int max = 0;
        char ch = '?';

        for (int i = 0; i < charIndex.length; i++) {
            if(charIndex[i] > max) {
                max = charIndex[i];
                ch = (char) (i + 'A');
            } else if (charIndex[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
