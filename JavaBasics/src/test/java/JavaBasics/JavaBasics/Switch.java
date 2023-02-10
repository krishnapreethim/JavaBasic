package JavaBasics.JavaBasics;



public class Switch {
	public static void main(String[] args) {
		String food="Mefhil";
		switch (food) {
		case "bawerchi":
			System.out.println("Good for Biryani");
			break;
		case "pistahouse":
			System.out.println("Good for Haleem");
		case "Istha":
			System.out.println("Good for sharwarma");
			break;
			default:
				System.out.println("No idea about that restarent");
				break;
		}
	}
	

}
