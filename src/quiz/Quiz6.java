package quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		boolean num1 = (7 % 2 == 1);
		boolean num2 = (10 % 2 == 0);

		System.out.println(num1); // true
		System.out.println(num2); // true
		
		int value = 10;
		int temp = value % 1;
		boolean result1 = (temp == 0); // 짝수인지 확인
		System.out.println(result1);
				

	}

}
