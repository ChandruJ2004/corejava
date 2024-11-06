package day2;

public class Constructor {
	private String name,city;
	private int number;
	private float percentage;
	
	public Constructor(String name,String city,int number,float percentage) {
		this.name=name;
		this.city=city;
		this.number=number;
		this.percentage=percentage;
	}
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public int number() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public float percentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage=percentage;
	}
	@Override
	public String toString() {
		return "Constructor [name=" + name + ", city=" + city + ", number=" + number + ", percentage=" + percentage
				+ "]";
	}
}