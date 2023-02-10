package JavaBasics.Basics;

public class Student {
	/*
	 * Objects have states and behaviors.
	 *  Example: A dog has states - color, name, breed as well as behaviors –
	 *   wagging the tail, barking, eating. 
	 *   An object is an instance of a class.
	 */
	String name;
	int age;
	public void getInfo() {
		System.out.println("The name of this Student is "+ this.name);
		System.out.println("The age of this Student is "+ this.age);
	}

		public static void main(String[] args) {
			Student s1 = new Student();
			s1.name = "Krishna";
			s1.age = 41;
			s1.getInfo();
			Student s2 = new Student();
		}
	}


