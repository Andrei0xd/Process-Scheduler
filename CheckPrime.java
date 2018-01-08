package Scheduler;

public class CheckPrime extends Process {

	/**
	 * CheckPrime Process Constructor
	 *
	 */
	public CheckPrime(String type, int weight) {
		super(type, weight);
	}
	
	/**
	 * @param n the number to be checked
	 * The Run method that is checking whether a the argument is prime or not
	 * @return 0 or 1
	 */
	public String Run(long n) {
		this.times++;
		if(n<2)
			return "0";
		if(Process.Prime(n))
			return "1";
		return "0";
	}
}
