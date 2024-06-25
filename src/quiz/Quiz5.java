package quiz;

public class Quiz5 {
	public static void main(String[] args) {
		int age = 32;
		boolean reult1 = (age < 40);

		boolean reult2 = (age == 40);

		boolean reult3 = (age != 40);

		System.out.println("나이가 40세 이하? " + reult1);
		System.out.println("나이가 40세? " + reult2);
		System.out.println("나이가 40세가 아니면? " + reult3);

	}
}
