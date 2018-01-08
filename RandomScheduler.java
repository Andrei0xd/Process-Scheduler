package Scheduler;

import java.util.Random;


/**
* The RandomScheduler class
* This is the class of a RandomScheduler which will randomly run the
* given processes on the given inputs.
* @author  Andrei-Ioan Cirnu
*/

public class RandomScheduler implements Scheduler{

	/**
	* The Start method,which will iterate through the NumbersToBeProcessed
	* and will run a process with them as an input,randomly.
	* It will first check if the result is already in the cache,
	* and if it isn't, it will use the Run method of the process on that
	* input.
	*/
	public void Start(ProblemData data,Cache c,String w) {
		HomeworkWriter writer = new HomeworkWriter(w);
		
		String returnString;
		
		for(int i=0;i<data.getNumbersToBeProcessed().length;i++)
		{
			Random rand = new Random();
			int randomNum = rand.nextInt(data.getProcesses().length);
			
			String x = c.ComputeCache(data.getProcesses()[randomNum].type, data.getNumbersToBeProcessed()[i]);
			if(!(x.equals("NotInCache"))){
				returnString=x + " FromCache";
				data.inctime(randomNum);}
			else {
				returnString = data.getProcesses()[randomNum].Run(data.getNumbersToBeProcessed()[i]);
				c.UpdateCache(data.getProcesses()[randomNum].type, data.getNumbersToBeProcessed()[i], returnString);
				returnString = returnString + " Computed";
			}
			writer.println( data.getNumbersToBeProcessed()[i] + " " + data.getProcesses()[randomNum].type + " " + returnString );
		}
		writer.close();
	}
}
	
