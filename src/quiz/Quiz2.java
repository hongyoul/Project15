package quiz;

import java.util.Scanner;

//Scanner를 사용하여 두자리 정수(10~99)를 입력 받으세요.
//그리고 십의자리와 일의자리의 합을 구하세요.

public class Quiz2 {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		
		int i = scanner1.nextInt();
		
		int num1 = i / 10;
		int num2 = i % 10;
		
		int sum = num1 + num2;

		System.out.println("십의자리와 일의자리의 합은 " + sum + "입니다");
		
	}

}
