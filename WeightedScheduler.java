package Scheduler;

/**
* The WeightedScheduler class
* 
* This is the class of a WeightedScheduler which will run the
* given processes in a Weighted way - at any given (sum_of_weights) times,
* each process should have ran for (process_weight) times.
*/
public class WeightedScheduler implements Scheduler {
	/**
	* The Start method,which will first call the updateWeights() method
	* which will divide each weight to the biggest common divisor of
	* all the weights. 
	* 
	* It will then iterate through the NumbersToBeProcessed
	* and will run each process until it's times == weights
	* 
	* 
	* When all processes have been ran for their weight time, all the times
	* are reseted to 0 by calling the resetTimes() method.
	*/
	
	public void Start(ProblemData data, Cache c,String w) {
		HomeworkWriter writer = new HomeworkWriter(w);
		String returnString;
		data.updateWeights();
		
		for(int i=0;i<data.getNumbersToBeProcessed().length;i++)
		{
			int j;
			for(j=0;j<data.getProcesses().length;j++) {
				if(data.getProcesses()[j].times<data.getProcesses()[j].weight)
					break;
				if((j==data.getProcesses().length-1) && data.getProcesses()[j].times == data.getProcesses()[j].weight)
				{
					data.resetTimes();
					j=0;
					break;
				}
			}
			
			String x = c.ComputeCache(data.getProcesses()[j].type, data.getNumbersToBeProcessed()[i]);
			if(!(x.equals("NotInCache"))){
					returnString=x + " FromCache";
					data.inctime(j);}
			else {
				returnString = data.getProcesses()[j].Run(data.getNumbersToBeProcessed()[i]);
				c.UpdateCache(data.getProcesses()[j].type, data.getNumbersToBeProcessed()[i], returnString);
				returnString = returnString + " Computed";
			}
			writer.println(data.getNumbersToBeProcessed()[i]  + " " + data.getProcesses()[j].type + " " + returnString );
		}
		writer.close();
	}
	
}
