package BaekJoon.List;

import java.io.*;
import java.util.LinkedList;

public class P1406_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // Java LinkedList head 와 tail 을 모두 관리
        // 첫 index, 끝 index 에 대한 접근 속도는 빠름
        LinkedList<Character> leftLine = new LinkedList<>();
        LinkedList<Character> rightLine = new LinkedList<>();
        //System.out.println(sc.nextLine());
        for (char item : br.readLine().toCharArray()) {
            leftLine.add(item);
        }

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String command = br.readLine();
            switch (command.charAt(0)) {
                case 'L':
                    if (!leftLine.isEmpty()) rightLine.add(0, leftLine.removeLast());
                    break;
                case 'D':
                    if (!rightLine.isEmpty()) leftLine.add(rightLine.removeFirst());
                    break;
                case 'B':
                    if (!leftLine.isEmpty()) leftLine.removeLast();
                    break;
                case 'P':
                    leftLine.add(command.charAt(2));
                    break;
            }
        }
        for (char item : leftLine) bw.write(item);
        for (char item : rightLine) bw.write(item);
        bw.flush();
        bw.close();
    }
}
