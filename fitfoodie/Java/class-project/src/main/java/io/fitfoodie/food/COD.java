package io.fitfoodie.food;

public class COD extends Payment{

	private boolean authorization;
	
	
	public boolean isAuthorization() {
		return authorization;
	}


	public void setAuthorization(boolean authorization) {
		this.authorization = authorization;
	}


	public boolean processPayment() {
		return false;
	}

}
