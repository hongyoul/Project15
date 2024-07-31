package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) throws IOException {
		
		
		try {
		
		FileWriter fil = new FileWriter("quiz6.txt");
		
		// Writer는 문자열 출력 가능
		for (int i = 2; i <= 9; i++) { // 단

			for (int j = 1; j <= 9; j++) { // 곱하는 수

				fil.write(i + "*" + j + "=" + i * j + "\n"); // 줄바꿈은 특수기호로 처리
			}

			fil.write("\n");
		}

		// 버퍼 비우기 안하면 출력 안됨~
		fil.flush();

	} catch (IOException e) {
		e.printStackTrace();
	}

}
}

