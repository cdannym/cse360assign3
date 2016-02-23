
package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	public int getTotal () {
		return total;
	}
	
	public String getHistory () {
		return history;
	}
	
	public void add (int value) {
		total = total + value;
		history = history + "+ " + value + " ";
	}
	
	public void subtract (int value) {
		total = total - value;
		history = history + "- " + value + " ";
	}
	
	public void multiply (int value) {
		total = total * total * value;
		history = history + "* " + value + " ";
	}
	
	public void divide (int value) {
		if ( value == 0 ){
			total = 0;
			history = history + "/ 0 ";
		}
		else{
			total = total / value;
			history = history + "/ " + value + " ";
		}
	}
}