package Scheduler;

/**
* The Process class, used as a strucutre.
* type - the type of process (square,cube,sqrt,fibonacci,factorial,checkprime,nextprime)
* times - times the process has been used so far
* weight - the process's weight for the WeightedScheduler
* @author  Andrei-Ioan Cirnu
*/

public abstract class Process {

	String type;
	int times;
	int weight;
	/**
	* The Process constructor, which will set it's type and it's weight.
	*/
	public Process(String type,int weight) {
		this.type=type;
		this.weight=weight;
	}
	
	/**
	* This method will check whether a number is prime or not. We will need both in
	* NextPrime and CheckPrime processes.
	* @param n The number we are checking wheter it is a prime or not.
	* @return true if it is a prime, false if it isn't
	*/
	public static boolean Prime(long n) {
		for(int i=2;2*i<=n;i++) {
			if(n%i==0)
				return false;
			}
		return true;
	}
	/**
	* The Run method will be abstract because it will depend on the type of the
	* process that will be ran.
	* @param n the number that will be given as input for the process.
	* @return A string of the result
	*/
	public abstract String Run(long n);

}
