package Scheduler;

public class Factorial extends Process{

	
	/**
	 * The Factorial Process Constructor
	 *
	 */
	public Factorial(String type, int weight) {
		super(type, weight);
	}

	
	/**
	 * @param n the n that we are applying factorial to.
	 * The Run method that is returning the factorial of the parameter.
	 */
	public String Run(long n){
		this.times++;
		int p = (int) n;
		if(n<0)
			return "0";
		if (p==0)
				return String.valueOf(1);
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;
			fact=fact%9973;
		}
	
		return String.valueOf(fact);
	}
}
