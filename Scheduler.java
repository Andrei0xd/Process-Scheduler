package Scheduler;

/**
* The Scheduler class
* This is the class of the Scheduler. It's only method, Start , will be
* different for each type of Scheduler ( RoundRobin, Random, Weighted)
* @author  Andrei-Ioan Cirnu
*/

public interface Scheduler {
	
	public void Start(ProblemData data,Cache c,String w);
}
