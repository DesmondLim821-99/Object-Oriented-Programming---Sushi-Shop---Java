package Assignment;


public class cashPayment extends payment{
        private double cashPaymentChange;
	private double cashPaymentAmountReceive;
    
        
	public cashPayment(double change, double amoutReceive) {
		super(change, amoutReceive);
		// TODO Auto-generated constructor stub
	}

    public double getCashPaymentChange() {
        return cashPaymentChange;
    }

    public void setCashPaymentChange(double cashPaymentChange) {
        this.cashPaymentChange = cashPaymentChange;
    }

    public double getCashPaymentAmountReceive() {
        return cashPaymentAmountReceive;
    }

    public void setCashPaymentAmountReceive(double cashPaymentAmountReceive) {
        this.cashPaymentAmountReceive = cashPaymentAmountReceive;
    }

    @Override
    public String toString() {
        return "cashPayment{" + "cashPaymentChange=" + cashPaymentChange + ", cashPaymentAmountReceive=" + cashPaymentAmountReceive + '}';
    }
	
        
}
