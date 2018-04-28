package io.fitfoodie.food;

public class Protein implements Nutrients{
	private int Protein;
	
	@Override
	public int getQuantity() {
		return Protein;
	}

	public void setQuantity(int quantity) {
		this.Protein = quantity;
	}
	
	public Protein(int quantity) {
		super();
		this.Protein = quantity;
	}
	
	public Protein() {
		this.Protein = 0;
	}
	
	@Override
	public String getName() {
		return "protein";
	}
}
