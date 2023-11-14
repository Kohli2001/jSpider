package enttiy;


public class Customer {
	private String cName;
	private int cid;
	private long cphno;
	private String email;
	private String cpan;
	private double camt;
	private Address caddress;
	public Customer(String cName, int cid, long cphno, String email, String cpan, double camt, Address caddress) {
		super();
		this.cName = cName;
		this.cid = cid;
		this.cphno = cphno;
		this.email = email;
		this.cpan = cpan;
		this.camt = camt;
		this.caddress = caddress;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpan() {
		return cpan;
	}
	public void setCpan(String cpan) {
		this.cpan = cpan;
	}
	public Address getCaddress() {
		return caddress;
	}
	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}
	

	public double getCamt() {
		return camt;
	}

	public void setCamt(double camt) {
		this.camt = camt;
	}

	@Override
	public String toString() {
		return "Customer [cName=" + cName + ", cid=" + cid + ", cphno=" + cphno + ", email=" + email + ", cpan=" + cpan
				+ ", camt=" + camt + ", caddress=" + caddress + "]";
	}

	
	
	
}
