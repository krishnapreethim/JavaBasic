package JavaBasics.JavaBasics;

public class multiplextheatre {
	public static void main(String[] args) {
		String multiplex = "Avangers";
		switch (multiplex) {
		case "Avangers":
			System.out.println("Good movie for watching");
			break;
		case "RRR":
			System.out.println("Oscer nomited movie");
			break;
		case "Black Panther":
			System.out.println("wonderfull move");
			break;
			default:
				System.out.println("No idea about the movies");
				break;
		}
	}

}
