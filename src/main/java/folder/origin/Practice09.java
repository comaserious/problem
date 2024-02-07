package folder.origin;

import java.util.Scanner;

public class Practice09 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("국어점수를 입력해주세요 : ");
        int word = scr.nextInt();
        System.out.print("영어점수를 입력해주세요 : ");
        int eng = scr.nextInt();

        int math = 80*3-word-eng;

        System.out.println("당신이 받아야할 최소 수학점수는 " + math);





    }



}
