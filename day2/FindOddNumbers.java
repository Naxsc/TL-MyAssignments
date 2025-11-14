package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Below are odd numbers between 1-10 ~");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				System.out.println("divided by 2 = " + (i / 2));
			}

		}
	}
}
