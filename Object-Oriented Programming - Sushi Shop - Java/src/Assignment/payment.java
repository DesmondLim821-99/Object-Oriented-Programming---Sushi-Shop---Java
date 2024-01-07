package Assignment;



import java.util.ArrayList;

// construtor
public class payment {
	// variable
	private double change;
	private static double amoutReceive;
        
        
	public payment(double change, double amoutReceive) {
		this.change = change;
		this.amoutReceive = amoutReceive;
	}
        
	// getter and setter for change use
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	
	// getter and setter for amount receive use
	public static double getAmoutReceive() {
		return amoutReceive;
	}
	public void setAmoutReceive(double amoutReceive) {
		this.amoutReceive = amoutReceive;
	}

    @Override
    public String toString() {
        return "payment{" + "change=" + change + '}';
    }
	
        

}