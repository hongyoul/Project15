package quiz;

import java.util.Scanner;

//Scanner를 사용하여 문자열을 계속 입력 받으세요.
//while 루프를 사용하여 입력을 받다가, 입력된 문자열이 "STOP"이면
//루프를 종료하세요. 단, "STOP"의 대소문자는 구분할 필요가 없습니다.

public class Quiz3 {

	public static void main(String[] args) {

		Scanner scanner2 = new Scanner(System.in);
		
		while (true) {
			System.out.println("문자를 입력하세요.");
			String str = scanner2.nextLine();
			
			if (str.toUpperCase().equals("STOP")) {
				break;
			}
			str.toUpperCase().equals("STOP");
			str.toUpperCase().equals("stop");
		}
		System.out.println("프로그램이 종료되었습니다");
	}

}
