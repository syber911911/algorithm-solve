package BaekJoon.List;

import java.io.*;
import java.util.Stack;

public class P1406Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftLine = new Stack<>(); // 커서 왼쪽 line
        Stack<Character> rightLine = new Stack<>(); // 커서 오른쪽 line

        for (char item : br.readLine().toCharArray()) {
            leftLine.push(item);
        }

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String command = br.readLine();
            switch (command.charAt(0)) {
                case 'L':
                    if (!leftLine.isEmpty()) rightLine.push(leftLine.pop());
                    break;
                case 'D':
                    if (!rightLine.isEmpty()) leftLine.push(rightLine.pop());
                    break;
                case 'B':
                    if (!leftLine.isEmpty()) leftLine.pop();
                    break;
                case 'P':
                    leftLine.push(command.charAt(2));
                    break;
            }
        }
        while (!rightLine.isEmpty()) leftLine.push(rightLine.pop());
//        StringBuilder sb = new StringBuilder();
        for (char item : leftLine) bw.write(item);
        bw.flush();
        bw.close();
    }
}
