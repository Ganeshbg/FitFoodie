package io.fitfoodie.food;

public class Fat implements Nutrients{
	private int Fat;
	
	@Override
	public int getQuantity() {
		return Fat;
	}

	public void setQuantity(int quantity) {
		this.Fat = quantity;
	}
	
	public Fat(int quantity) {
		super();
		this.Fat = quantity;
	}

	public Fat() {
		this.Fat = 0;
	}

	@Override
	public String getName() {
		return "fat";
	}

}
