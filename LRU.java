package Scheduler;


/**
* This class is for the LRU Cache type.
* size - the current size of the arrat of StructLFU objects.
* nLines - the total lines allowed to have ine the array of StructLFU objects
* vec the - array of StructLFU objects
* @author  Andrei-Ioan Cirnu
*/
public class LRU implements Cache{
	int size;
	int nLines;
	StructLFU[] vec;
	
	
	/**
	* LRUCache constructor. It initializes the array of StructLFU objects
	* and it sets it's current size to 0
	*/
	public LRU(int nLines) {
		this.nLines=nLines;
		vec = new StructLFU[nLines];
		size=0;
	}
	
	/**
	* The method that is looking through the array of StructLFU in search of
	* the process we are currently running.
	* If it finds it , we put it at the top of the array and return it
	* Else, we return the string "NotInCache" so that we know we will have to
	* compute the process's result.
	*/
	public String ComputeCache(String proc,int n) {
		for(int i=0;i<size;i++) {
			
			if(vec[i].pName.equals(proc) && n == vec[i].n) {
				String res=vec[i].result;
				for(int j=i;j<size-1;j++) {
					vec[j]=vec[j+1];
					
				}
				vec[size-1]= new StructLFU(proc,n,res);
				return res;
			}	
		}
		return "NotInCache";
		
	}
	
	/**
	* This method is looking through the array of StructLFU objects.
	* In the case that it is not yet full, it will add the StructLFU object
	* (the process-number that we are currently processing) at the top of the array
	* If it is full, we remove the one on the bottom of the array( which will be
	* the one that was used least recently) and add the new one at the top
	* of our array.
	*/
	public void UpdateCache(String pName,int n,String result) {
		if(size<nLines) {
			vec[size]=new StructLFU(pName,n,result);
			size++;
		}
		else
		{
			for(int i=0;i<nLines-1;i++) {
				vec[i]=vec[i+1];
				
			}
			vec[nLines-1]= new StructLFU(pName,n,result);
		}
	}
}
