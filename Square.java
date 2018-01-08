package Scheduler;

public class Square extends Process{

	/**
	 * The Square Process Constructor
	 *
	 */
	public Square(String type, int weight) {
		super(type, weight);
	}

	/**
	 * @param n the number to be squared
	 * The Run method that is returning the square root of the number.
	 * @return sqrt(n)
	 */
	public String Run(long n){
		this.times++;
		return String.valueOf((int) Math.floor(Math.pow(n, 2)));
	}
}
