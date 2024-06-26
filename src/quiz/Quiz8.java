package quiz;

public class Quiz8 {

	public static void main(String[] args) {
		int x = 80;
		int y = 5;

		boolean answer1 = (x > 50) && (x < 100);
		boolean answer2 = (y < 10) || (y > 30);

		System.out.println("x=80 ==> x>50 AND x<100? : " + answer1);
		System.out.println("y=5 ==> y<10 OR y>30? : " + answer2);

	}

}
