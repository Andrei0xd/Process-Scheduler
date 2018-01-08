package Scheduler;



/**
* This class is for the LFU Cache type.
* size - the current size of the arrat of StructLFU objects.
* nLines - the total lines allowed to have ine the array of StructLFU objects
* vec the - array of StructLFU objects
* @author  Andrei-Ioan Cirnu
*/
public class LFU implements Cache{

	int size;
	int nLines;
	StructLFU[] vec;
	
	/**
	* LFUCache constructor. It initializes the array of StructLFU objects
	* and it sets it's current size to 0
	*/
	public LFU(int nLines) {
		this.nLines=nLines;
		vec = new StructLFU[nLines];
		size=0;
	}
	
	/**
	* The method that is looking through the array of StructLFU in search of
	* the process we are currently running.
	* If it finds it , we increase its usedTimes and return it.
	* Else, we return the string "NotInCache" so that we know we will have to
	* compute the process's result.
	*/
	public String ComputeCache(String proc,int n) {
		for(int i=0;i<size;i++) {
			if(vec[i].pName.equals(proc) && n == vec[i].n) {
				vec[i].usedTimes++;
				return vec[i].result;
			}	
		}
		
		return "NotInCache";
		
	}
	/**
	* This method is looking through the array of StructLFU objects to find the
	* one that has been used the least times
	* It returns it's positon in the array
	*/
	public int findlfu() {
		int pos=0,min = Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if (vec[i].usedTimes<min) {
				min=vec[i].usedTimes;
				pos=i;
			}
		}
		return pos;
	}
	
	/**
	* This method will update the LFU Cache. In case the array is not yet full,
	* it will ad a new StructLFU object. If it is full , it will look for the
	* least used StructLFU object and replace it with a new one
	*/
	public void UpdateCache(String pName,int n,String result) {
		if(size<nLines) {
			vec[size]=new StructLFU(pName,n,result);
			size++;
		}
		else
		{
			int pos=findlfu();
			vec[pos]=new StructLFU(pName,n,result);
		}
	}
	
}
