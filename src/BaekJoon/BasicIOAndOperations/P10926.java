package BaekJoon.BasicIOAndOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String userId = bf.readLine();
        System.out.println(userId + "??!");
        bf.close();
    }
}
