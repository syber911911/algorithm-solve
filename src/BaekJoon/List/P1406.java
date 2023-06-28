package BaekJoon.List;

import java.io.*;
import java.util.LinkedList;

public class P1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> line = new LinkedList<>();
        //System.out.println(sc.nextLine());
        for (char item : br.readLine().toCharArray()) {
            line.add(item);
        }

        int index = line.size();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String command = br.readLine();
            switch (command.charAt(0)) {
                case 'L':
                    if (index != 0) index--;
                    break;
                case 'D':
                    if (index != line.size()) index++;
                    break;
                case 'B':
                    if (index != 0) line.remove(--index);
                    break;
                case 'P':
                    line.add(index++ ,command.charAt(2));
                    break;
            }
        }
        for (char item : line) bw.write(item);
        bw.flush();
        bw.close();
    }
}
