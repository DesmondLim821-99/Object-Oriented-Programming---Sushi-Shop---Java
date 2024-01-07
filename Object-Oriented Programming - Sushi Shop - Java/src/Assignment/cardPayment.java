package Assignment;

public class cardPayment extends payment {
	
	// variable
	private String cardHolderName;
	private int cardNumber;
	private int cvv;
	
	//construtor
	public cardPayment(double change) {
		super(change, getAmoutReceive());
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	// getter and setter for cardholdername use
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	
	// getter and setter for cardnumber use
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	//getter and setter for cvv use
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

    @Override
    public String toString() {
        return "cardPayment{" + "cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", cvv=" + cvv + '}';
    }
	
        
}
