package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] strCount = new int[26];
        Arrays.fill(strCount, -1);

        String inputStr = bf.readLine();
        for (int i = 0; i < inputStr.length(); i++) {
            int index = inputStr.charAt(i) - 'a';
            if (strCount[index] == -1) strCount[index] = i;
        }
        for (int item : strCount) System.out.print(item + " ");
    }
}
