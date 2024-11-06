package day5;
class Grandpa{
	public void home() {
		System.out.println("3 BHK");
	}
}
class dad extends Grandpa{
	public void car() {
		System.out.println("2 cars");
	}
}
class son extends dad{
	public void bike() {
		System.out.println("1 bike");
	}
}
public class Multilevel {
	public static void main(String[] args) {
	son obj=new son();
	obj.home();
	obj.car();
	obj.bike();
	}
}