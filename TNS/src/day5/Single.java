package day5;
class Dad{ //base class
	public void home() {
		System.out.println("have own house");
	}
}
class Son extends Dad{ //derived class
	public void car() {
		System.out.println("have own car");
	}
}
public class Single {
	public static void main(String[] args) {
		Son o=new Son();
		o.car();
		o.home();
	}
}
