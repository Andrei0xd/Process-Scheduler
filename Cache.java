package Scheduler;

/**
 * @author Andrei-Ioan Cirnu
 *
 */

public interface Cache {
	
	/**
	 * The method that is looking through the process-results stored in cache
	 *
	 */
	abstract String ComputeCache(String proc,int n);
	
	/**
	 * The method that updates the cache accordingly to it's type
	 *
	 */
	abstract void UpdateCache(String pName,int n,String result);
}
