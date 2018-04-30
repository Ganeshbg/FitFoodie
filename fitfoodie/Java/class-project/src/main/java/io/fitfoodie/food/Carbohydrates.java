package io.fitfoodie.food;


public class Carbohydrates implements Nutrients {

	private int Carbohydrates;

	@Override
	public int getQuantity() {
		return Carbohydrates;
	}

	public void setQuantity(int quantity) {
		this.Carbohydrates = quantity;
	}

	public Carbohydrates(int quantity) {
		super();
		this.Carbohydrates = quantity;
	}

	public Carbohydrates() {
		this.Carbohydrates = 0;
	}

	@Override
	public String getName() {
		return "carbohydrates";
	}

}
