package BaekJoon.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27323 {
    public static void main(String[] args) throws IOException {
        // 입력 ==> 직사각형의 세로, 가로의 길이가 한 줄씩 입력
        // 출력 ==> 직사각형의 넓이
        // 1. 세로, 가로의 길이를 입력 받아 변수에 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(br.readLine());
        int width = Integer.parseInt(br.readLine());

        // 2. 가로, 세로의 길이를 저장한 두 변수의 곱 (넓이) 출력
        System.out.println(height * width);
    }
}
