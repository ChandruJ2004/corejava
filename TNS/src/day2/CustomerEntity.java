package day2;

public class CustomerEntity {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();

		c1.setCid(01);
		c1.setName("abc");
		c1.setAddress("tvm");
		c1.setCity("Chennai");

		c2.setCid(02);
		c2.setName("def");
		c2.setAddress("Mkm");
		c2.setCity("Vellore");

		c3.setCid(03);
		c3.setName("ghi");
		c3.setAddress("rsn");
		c3.setCity("Goa");

		c4.setCid(04);
		c4.setName("jkl");
		c4.setAddress("atp");
		c4.setCity("Vpm");

		c5.setCid(05);
		c5.setName("mno");
		c5.setAddress("tkm");
		c5.setCity("Delhi");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}

}
