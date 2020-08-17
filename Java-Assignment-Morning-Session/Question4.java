
//Question 4. Write a programme to serialize 3 fields out of 5 and deserialize it. Use UUID to prevent object mutation.

import java.io.*;
import java.util.Date;

class Student implements Serializable {
	
	private static final long serialVersionUID = 10L;

	String email;
	transient String password; // making it transient for security purpose
	String name;
	Date dob;
	transient int age; // making it transient because it can be calculated from date of birth(dob)

	public Student(String email, String password, String name, Date dob, int age) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.dob = dob;
		this.age = age;
	}

}

public class Question4 {
	public static void printdata(Student object1) {

		System.out.println("Email = " + object1.email);
		System.out.println("password = " + object1.password);
		System.out.println("Name = " + object1.name);
		System.out.println("D.O.B = " + object1.dob);
		System.out.println("Age = " + object1.age);
	}

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Student object = new Student("abc@gmail.com", "passw0rd", "abc", new Date(1998,9,26), 21);
		String filename = "Data.txt";

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Data before Deserialization.");
			System.out.println();
			printdata(object);
			System.out.println();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		object = null;

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			object = (Student) in.readObject();

			in.close();
			file.close();
			System.out.println("Data after Deserialization.");
			System.out.println();
			printdata(object);
			System.out.println();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
