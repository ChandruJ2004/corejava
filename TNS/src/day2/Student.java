package day2;

public class Student {
	private int sid;
	private String name;
	private String dept;
	private String stream;
	private int GradYr;
	private String number;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getGradYr() {
		return GradYr;
	}

	public void setGradYr(int gradYr) {
		this.GradYr = gradYr;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dept=" + dept + ", stream=" + stream + ", GradYr=" + GradYr
				+ ", number=" + number + "]";
	}
}
