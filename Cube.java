package Scheduler;

public class Cube extends Process{

	/**
	 * The Cube Process Constructor
	 *
	 */
	public Cube(String type, int weight) {
		super(type, weight);

	}
	/**
	 * @param n the number to be raised to the power of 3
	 * The Run method that is returning the number to the power of 3
	 * @return n^3
	 */
	public String Run(long n){
		this.times++;
		return String.valueOf((int) Math.floor(Math.pow(n,3)));
	}
}
