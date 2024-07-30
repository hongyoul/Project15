package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {

		
		// 텍스트 파일과 연결된 입력 스트림 생성
		FileInputStream fis = new FileInputStream("input.txt");
		
		System.out.println(fis.read()); // 출력값 : 65(아스키 코드로 출력됨)
		System.out.println(fis.read()); // 출력값 : 66
		System.out.println(fis.read()); // 출력값 : 67
		
		
		// 이전 스트림(fis)은 사용이 끝남. 새로운 스트림(fisN)을 생성해야함
		FileInputStream fis1 = new FileInputStream("input.txt");
		
		System.out.println((char)fis1.read()); // 출력값: A
		System.out.println((char)fis1.read()); // 출력값: B
		System.out.println((char)fis1.read()); // 출력값: C
		
	}

}
