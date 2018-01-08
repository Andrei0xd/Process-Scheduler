package Scheduler;


/**
* The NoCache class. In case we are not using any cache.
* @author  Andrei-Ioan Cirnu
*/

public class NoCache implements Cache{

	/**
	* The ComputeCache method will always return "NotInCache" , so that we always
	* have to compute our result , considering that we do not have a Cache at all.
	*/
	public String ComputeCache(String proc, int n) {
		return "NotInCache";
	}

	/**
	* The UpdateCache method does nothing, because we do not have Cache to update.
	*/
	public void UpdateCache(String pName, int n, String result){
		//Do Nothing!
	}

	
}
