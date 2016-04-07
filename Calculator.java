public class Calculator {
	
	private double result;
	
	public void add(double ... params) {
		for(double param : params) {
			this.result += param;
		}
	}
	
	public double get() {
		return this.result;
	}
	
	public void remove() {
		this.result = 0.0;
	}
}