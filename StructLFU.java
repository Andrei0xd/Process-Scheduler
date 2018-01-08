package Scheduler;


/**
* The StructLFU class that is acting like a structure.
* It will be used in the LFU and LRU cache.
* pName - The name of the process
* n the - number to be processed
* result - the result of the process over the given number ( input)
* usedTimes - times we have used it from the Cache - For the LFU Cache
* @author  Andrei-Ioan Cirnu
*/

public class StructLFU {
	String pName;
	int n;
	String result;
	int usedTimes;
	public StructLFU(String pName,int n, String result) {
		super();
		this.pName = pName;
		this.n=n;
		this.result = result;
		this.usedTimes = 0;
	}
	
	
}
