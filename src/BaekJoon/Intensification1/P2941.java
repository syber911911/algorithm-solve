package BaekJoon.Intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        for (String item : alpha) {
            if (inputStr.contains(item)) {
                inputStr = inputStr.replaceAll(item, "!");
            }
        }
        System.out.println(inputStr.length());
    }
}
