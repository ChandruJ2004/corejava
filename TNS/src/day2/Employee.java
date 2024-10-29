//collecting 3 employee details(Eid,Ename,City)
package day2;

public class Employee {
	// data members in private
	private int eid;
	private String ename;
	private String city;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", city=" + city + "]";
	}

}
