package twopointers;

import java.util.Scanner;

public class SumOfConsecutive {

/*
    설명

    N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

    만약 N=15이면 7+8=15 4+5+6=15  1+2+3+4+5=15와 같이 총 3가지의 경우가 존재한다.
 */

    public static int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                System.out.println(n + " " + cnt);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(solution(n));
    }


}
