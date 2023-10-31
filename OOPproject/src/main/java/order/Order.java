package order;

public class Order {
	private String ordername;
	private String orderdate;
	private String ordertype;
	private String ordercontent;
	private String diliverymethod;
	private int ouid;
	
	//Overloaded constructor for class Order
	public Order(String ordername, String orderdate, String ordertype, String ordercontent,
			String diliverymethod,int ouid) {
		super();
		this.ordername = ordername;
		this.orderdate = orderdate;
		this.ordertype = ordertype;
		this.ordercontent = ordercontent;
		this.diliverymethod = diliverymethod;
		this.ouid = ouid;
	}
	
	//Setters and getters for retrieve values by JSTL library
	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public String getOrdercontent() {
		return ordercontent;
	}

	public void setOrdercontent(String ordercontent) {
		this.ordercontent = ordercontent;
	}

	public String getDiliverymethod() {
		return diliverymethod;
	}

	public void setDiliverymethod(String diliverymethod) {
		this.diliverymethod = diliverymethod;
	}
	public int getOuid() {
		return ouid;
	}
	public void setOuid(int ouid) {
		this.ouid = ouid;
	}
	
	
	
	

}
