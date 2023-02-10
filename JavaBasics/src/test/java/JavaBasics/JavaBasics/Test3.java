package JavaBasics.JavaBasics;

public class Test3 {
	public void eligible_ForJob() {
		String graduation="Bsc";
		if(graduation.equals("Btech")) {
			System.out.println("Eligible for associate professor");
		}
		else if(graduation.equals("mtech")) {
			System.out.println("Eligible for professor");
		}
		else if(graduation.equals("phd")) {
			System.out.println("Eligible for HOD");
			
		}
		else {
			System.out.println("Not eligible for professor job...!");
		}
	}
	public static void main(String[] args) {
		//Classname ref=new Classname();
		Test3 ref=new Test3();
		ref.eligible_ForJob();
	}

}
