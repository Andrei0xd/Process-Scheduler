package Scheduler;

public class NextPrime extends Process{
	/**
	 * The NextPrime Process Constructor
	 *
	 */
	public NextPrime(String type, int weight) {
		super(type, weight);
	}

	/**
	 * @param n - we are trying to return the next prime number after it
	 * The Run method that is returning the prime next prime number bigger than
	 * our parameter.
	 */
	public String Run(long n) {
		this.times++;
		int p = (int) n;
		if(n<2)
			return String.valueOf(2);
		
		for(int i=p+1;true;i++)
			if(Process.Prime(i))
				return String.valueOf(i);
	}
}
