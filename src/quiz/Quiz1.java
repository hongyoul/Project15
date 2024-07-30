package quiz;

import java.util.Scanner;

//5개 크기의 정수형 배열을 생성하세요
//Scanner를 사용하여 배열에 숫자 5개를 입력 받으세요.
//그리고 배열의 모든 요소의 합을 구하세요

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //System.in은 자주 사용안하고 Scanner를 주로 사용한다.
		int[] arr = new int[5];
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.");
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();
		arr[3] = scanner.nextInt();
		arr[4] = scanner.nextInt();
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("숫자를 입력하세요.");
//			arr[i] = scanner.nextInt();
//		}
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
		}
		System.out.println("배열: " + arr);
		System.out.println("숫자 5개의 합은 " + sum + "입니다.");
		
	}

}
