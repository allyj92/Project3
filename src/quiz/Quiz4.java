package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		int math = 90;
		int eng = 70;
		int kor = 100;
		
		int sum = math + eng + kor;
		double avg = sum / 3.0;
		
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : " + (avg));
	}

}
