package BaekJoon.Intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double totalScore = 0;
        double totalGrades = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double grades = Double.parseDouble(st.nextToken());
            String score = st.nextToken();
            switch (score) {
                case "A+":
                    totalScore += 4.5 * grades;
                    totalGrades += grades;
                    break;
                case "A0":
                    totalScore += 4.0 * grades;
                    totalGrades += grades;
                    break;
                case "B+":
                    totalScore += 3.5 * grades;
                    totalGrades += grades;
                    break;
                case "B0":
                    totalScore += 3.0 * grades;
                    totalGrades += grades;
                    break;
                case "C+":
                    totalScore += 2.5 * grades;
                    totalGrades += grades;
                    break;
                case "C0":
                    totalScore += 2.0 * grades;
                    totalGrades += grades;
                    break;
                case "D+":
                    totalScore += 1.5 * grades;
                    totalGrades += grades;
                    break;
                case "D0":
                    totalScore += 1.0 * grades;
                    totalGrades += grades;
                    break;
                case "F":
                    totalScore += 0.0 * grades;
                    totalGrades += grades;
                    break;
            }
        }
        System.out.printf("%.6f\n", totalScore / totalGrades);
    }
}
