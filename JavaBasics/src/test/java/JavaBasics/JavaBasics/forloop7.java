package JavaBasics.JavaBasics;

public class forloop7 {

	public static void main(String[] args) {
		System.out.println("Odd numbers between 200 and 25 in reverse order:");
		for (int i = 199; i >= 25; i--) {
			if (i % 2 != 0) {
				System.out.print(i+" ");
			}
		}
	}
}
