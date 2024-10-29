package day2;

public class EmployeeDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.setEid(101);
		e1.setEname("chan");
		e1.setCity("TVM");

		e2.setEid(102);
		e2.setEname("tiwa");
		e2.setCity("Chennai");

		e3.setEid(103);
		e3.setEname("Vid");
		e3.setCity("Goa");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

	@Override
	public String toString() {
		return "EmployeeDemo []";
	}
}