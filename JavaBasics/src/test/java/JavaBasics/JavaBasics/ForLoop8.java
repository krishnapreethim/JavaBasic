package JavaBasics.JavaBasics;

public class ForLoop8 {
	 public static void main(String[] args) {
		    String str = "krishnapreethi";
		    System.out.println("Original String: " + str);
		    System.out.print("Reverse String: ");
		    for (int i = str.length() - 1; i >= 0; i--) {
		      System.out.print(str.charAt(i));
		    }
		  }

}
