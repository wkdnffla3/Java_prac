package ch03;

import java.util.Scanner;

public class 연습문제3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("숫자 입력 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');
        System.out.println(grade);
        scan.close();
    }
}
