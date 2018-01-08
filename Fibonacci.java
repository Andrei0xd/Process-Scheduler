package Scheduler;

public class Fibonacci extends Process{

	/**
	 * The Fibonacci Process Constructor
	 *
	 */
	public Fibonacci(String type, int weight) {
		super(type, weight);
	}

	
	/**
	 * @param n the nth Fibonacci number that we are looking for
	 * The Run method that is returning the nth Fibonacci number
	 */
	public String Run(long n) {
		this.times++;
		long num1=0,num2=1,aux;
		
		if(n<0)
			return "-1";
		if(n==0)
			return "0";
		
		for(int i=1;i<n;i++) {
			aux = num2;
			num2=(num1+num2)%9973;
			num1=aux;
		}

		return String.valueOf(num2);

	}
}
