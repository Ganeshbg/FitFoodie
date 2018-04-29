package io.fitfoodie.food;

public class Paytm extends Payment{
	private Card card;
	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public boolean processPayment() {
		return false;
	}

}
