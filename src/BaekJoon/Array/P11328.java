package BaekJoon.Array;

import java.util.Arrays;
import java.util.Scanner;

public class P11328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            char[] arr1 = sc.next().toCharArray();
            char[] arr2 = sc.next().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(new String(arr1).equals(new String(arr2))) System.out.println("Possible");
            else System.out.println("Impossible");
        }
    }
}
