package JavaBasics.JavaBasics;

public class foeloop5 {

	/*public static void main(String[] args) {
		System.out.println("Prime numbers between 50 and 150:");
		for (int i = 50; i <= 150; i++) {
                System.out.println(i);
			
		}

	}*/
	 public static void main(String[] args) {
		    System.out.println("Prime numbers between 50 and 150:");
		    for (int i = 50; i <= 150; i++) {
		      boolean isPrime = true;
		      for (int j = 2; j < i; j++) {
		        if (i % j == 0) {
		          isPrime = false;
		          break;
		        }
		      }
		      if (isPrime) {
		        System.out.print(i + " ");
		      }
		    }
		  }
}
