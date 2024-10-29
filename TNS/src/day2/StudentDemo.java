package day2;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setSid(1);
		s1.setName("chan");
		s1.setDept("EEE");
		s1.setStream("Er");
		s1.setGradYr(2025);
		s1.setNumber("923937928");
		s2.setSid(2);
		s2.setName("rock");
		s2.setDept("E&I");
		s2.setStream("Er");
		s2.setGradYr(2024);
		s2.setNumber("8394782379");
		s3.setSid(3);
		s3.setName("Haver");
		s3.setDept("Aero");
		s3.setStream("Er");
		s3.setGradYr(2026);
		s3.setNumber("9898457289");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
