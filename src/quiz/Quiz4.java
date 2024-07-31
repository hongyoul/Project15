package quiz;

import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) throws IOException {
	
		try {
		
		FileOutputStream fos = new FileOutputStream("quiz4.txt");

		fos.write('A');
		fos.write('B');
		fos.write('C');
//		...
		fos.write('Z');
	
		// 초기값: 문자 'A'의 아스키값
		for (int i = 65; i <= 90; i++) {
			fos.write(i);
		}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//		byte[] arr = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
