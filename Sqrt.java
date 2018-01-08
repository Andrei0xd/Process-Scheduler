package Scheduler;

public class Sqrt extends Process{
	/**
	 * The Sqrt Process Constructor
	 *
	 */
	public Sqrt(String type, int weight) {
		super(type, weight);
	}
	/**
	 * @param n the number to be raised to the power of 2
	 * The Run method that is returning the number to the power of 2
	 * @return n^2
	 */
	public String Run(long n){
		this.times++;
		if(n<0)
			n*=-1;
		return String.valueOf((int) Math.floor(Math.sqrt(n)));
	}
}
