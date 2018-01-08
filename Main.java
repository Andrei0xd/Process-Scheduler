package Scheduler;

public class Main {

	public static void main(String args[]) {
		HomeworkReader read = new HomeworkReader(args[0]);
		Scheduler sch;
		Cache c;
		
		ProblemData data = read.readData();
		
		if(data.getSchedulerType().equals("RandomScheduler"))
			sch = new RandomScheduler();
		else if(data.getSchedulerType().equals("RoundRobinScheduler"))
			sch = new RoundRobinScheduler();
		else
			sch = new WeightedScheduler();
		
		
		
		if(data.getCacheType().equals("LfuCache")) 
			c = new LFU(data.getCacheCapacity());
		else if(data.getCacheType().equals("LruCache"))
			c = new LRU(data.getCacheCapacity());
		else
			c = new NoCache();
		String w = args[1];
		sch.Start(data,c,w);
	}
}
