package quiz;

public class Quiz11 {

	public static void main(String[] args) {

		int result = factorial(3);
		System.out.println(result);
	}
	// 3팩토리얼 구하는 과정
	// 3!
	// 3*2
	// 2*1
	// return 1
	
		// 팩토리얼 : 5! => 5*4*3*2*1
		public static int factorial (int num) {
		// 5!=>5*4
		// 4!=>4*3
			if (num == 1) {
				return 1;
			} else {
				return num * factorial(num -1);
			}
		}
		

// 먼저 실행된 함수가 나중에 끝남..
		// 호출순서와 완료순서는 서로의 반대이다.
		
		
// 호출순서
// main()
// factorial(3); 3!
// 3 *	factorial(2); 3 * 2
// factorial(1); 2 * 1

// 완료순서
// factorial(1);
// 3 *	factorial(2); -> 1이 끝나기 전까지 열려있음
// factorial(3); -> 1이 끝나기 전까지 열려있음
// main()

	
}
