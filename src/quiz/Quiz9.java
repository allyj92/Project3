package quiz;

public class Quiz9 {

	public static void main(String[] args) {
		String result = (5 > 3) ? "오" : "삼";
		System.out.println(result);
		
		// 다음 코드를 보고 풀이과정과 예상결과값을 주석으로 작성하세요
		int x = 10;
		int y = 20;
		int result1 = (x>10)? y+10:y-10; // false => y - 10 
		System.out.println(result1); // 10

	}

}
