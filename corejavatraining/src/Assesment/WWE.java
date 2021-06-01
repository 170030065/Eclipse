package Assesment;

public class WWE {

	private String fName;
	private String lName;
	private int weight;
	public WWE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public WWE(String fName, String lName, int weight) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.weight = weight;
	}
	
	
}
