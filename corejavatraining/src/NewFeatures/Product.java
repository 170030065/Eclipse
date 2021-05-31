package NewFeatures;

public class Product {

	private int pid;
	private String pname;
	private String pcategory;
	private int pprice;
	private int pquantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public Product(int pid, String pname, String pcategory, int pprice, int pquantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcategory = pcategory;
		this.pprice = pprice;
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcategory=" + pcategory + ", pprice=" + pprice
				+ ", pquantity=" + pquantity + "]";
	}
	
	
}
