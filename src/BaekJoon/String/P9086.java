package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int repeatNum = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatNum; i++) {
            String inputStr = bf.readLine();
            sb.append(inputStr.charAt(0));
            sb.append(inputStr.charAt(inputStr.length() - 1) + "\n");
//            System.out.print(BaekJoon.String.valueOf(inputStr.charAt(0)));
//            System.out.println(BaekJoon.String.valueOf(inputStr.charAt(inputStr.length() - 1)));
        }
        //System.out.println(sb);
    }
}
