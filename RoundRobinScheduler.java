package Scheduler;


/**
* The RoundRobinScheduler class
* This is the class of a RoundRobinScheduler which will run the
* given processes in a Round Robin way - at any given time any process
* hasn't been ran more than once over any other process.
* @author  Andrei-Ioan Cirnu
*/

public class RoundRobinScheduler implements Scheduler{

	/**
	* The Start method,which will iterate through the NumbersToBeProcessed
	* and will run each process in the Process array once.
	* Before running it, it will check whether the Process and it's result
	* is already in the cache or not.
	*/
	public void Start(ProblemData data,Cache c,String w) {
		HomeworkWriter writer = new HomeworkWriter(w);
		String returnString;
		
		for(int i=0;i<data.getNumbersToBeProcessed().length;i++)
		{
			int j;
			int min=data.getmin();

			for(j=0;j<data.getProcesses().length;j++)
				if(data.getProcesses()[j].times==min)
					break;
			
			String x = c.ComputeCache(data.getProcesses()[j].type, data.getNumbersToBeProcessed()[i]);
			if(!(x.equals("NotInCache"))){
					returnString=x + " FromCache";
					data.inctime(j);}
			else {
					returnString = data.getProcesses()[j].Run(data.getNumbersToBeProcessed()[i]);
					c.UpdateCache(data.getProcesses()[j].type, data.getNumbersToBeProcessed()[i], returnString);
					returnString = returnString+ " Computed";
			}
			writer.println(data.getNumbersToBeProcessed()[i] + " " + data.getProcesses()[j].type + " " + returnString  );
		}
		
		writer.close();
		
	}
}
