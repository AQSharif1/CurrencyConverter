
public class Runner {
	private int dollar;
	
	public Runner(int dollar) {
		this.dollar = dollar;
	}

	public int getDollar() {
		return dollar;
	}

	public void setDollar(int dollar) {
		this.dollar = dollar;
	}

	@Override
	public String toString() {
		return "US Currency: [dollar=" + dollar + "]";
	}
	


}
