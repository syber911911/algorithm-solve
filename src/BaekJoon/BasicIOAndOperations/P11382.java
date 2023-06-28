package BaekJoon.BasicIOAndOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long operand1 = Long.parseLong(st.nextToken());
        long operand2 = Long.parseLong(st.nextToken());
        long operand3 = Long.parseLong(st.nextToken());

        System.out.println(operand1 + operand2 + operand3);
    }
}
