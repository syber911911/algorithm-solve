package BaekJoon.IfElse;

import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        if(val1 == val2 && val1 == val3) System.out.println(10000 + val1 * 1000);
        else if(val1 == val2 || val1 == val3) System.out.println(1000 + val1 * 100);
        else if(val2 == val3) System.out.println(1000 + val2 * 100);
        else System.out.println(Math.max(Math.max(val1, val2), val3) * 100);

        /*try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] countArr = new int[7];
            int money = 0;

            while (st.hasMoreTokens()) {
                countArr[Integer.parseInt(st.nextToken())]++;
            }

            for (int i = 1; i < countArr.length; i++) {
                if (countArr[i] == 3) {
                    money = 10000 + i * 1000;
                    break;
                }
                if (countArr[i] == 2) {
                    money = 1000 + i * 100;
                    break;
                }
                if (countArr[i] == 1) {
                    money = i * 100;
                }
            }

            System.out.print(money);
        }*/
    }
}
