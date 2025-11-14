package week1.day2;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		for (int i = 1; i <= 8; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;

		}
	}
}
