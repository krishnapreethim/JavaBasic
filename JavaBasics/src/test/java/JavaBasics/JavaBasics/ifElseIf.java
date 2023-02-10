package JavaBasics.JavaBasics;

public class ifElseIf {
	public static void main(String[] args) {
		String gender= "Transgender";
		if(gender.equals("Male")) {//Fales
			System.out.println("Not Eligible for this job");
		}
		else if (gender.equals("Female")) {
			System.out.println("Not Eligible for this job");
		}
		else
		{
			System.out.println("please check your gender and try again");
		}
		
	}

}
