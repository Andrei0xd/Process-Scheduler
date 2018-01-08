/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scheduler;

/**
 *
 * @author alexm
 */
public class ProblemData {

    private String cacheType;
    private int cacheCapacity;
    private String schedulerType;
    private Process[] processes;
    private int[] numbersToBeProcessed;
    
    public ProblemData(String cacheType, int cacheCapacity, String schedulerType, Process[] processes, int[] numbersToBeProcessed) {
        this.cacheType = cacheType;
        this.cacheCapacity = cacheCapacity;
        this.schedulerType = schedulerType;
        this.processes = processes;
        this.numbersToBeProcessed = numbersToBeProcessed;
    }
    
    public void inctime(int i) {
    	processes[i].times++;
    }
  
    /**
     * @return the cacheType
     */
    public String getCacheType() {
        return cacheType;
    }

    /**
     * @return the cacheCapacity
     */
    public int getCacheCapacity() {
        return cacheCapacity;
    }

    /**
     * @return the schedulerType
     */
    public String getSchedulerType() {
        return schedulerType;
    }

    /**
     * @return the processes
     */
    public Process[] getProcesses() {
        return processes;
    }

    /**
     * @return the numbersToBeProcessed
     */
    public int[] getNumbersToBeProcessed() {
        return numbersToBeProcessed;
    }    
    
    public int getmin() {
    	int j,min = Integer.MAX_VALUE;
		for(j=0;j<processes.length;j++)
			if(processes[j].times<min)
				min=processes[j].times;
		return min;
    }
    
    public int GCD(int a, int b) {
    	   if (b==0) return a;
    	   return GCD(b,a%b);
    	}
    
    /**
     * @return the the greatest common divisor of all the weights in the Process[] array.
     */
    public int cmmdc() {
    	int c=processes[0].weight;
    	for(int i=0;i<processes.length;i++)
    		c=GCD(c,processes[i].weight);
    	return c;
    }
    
    /**
     * This method will divide all the weights to the biggest common divisor.
     */
    public void updateWeights() {
    	int c=this.cmmdc();
    	for(int i=0;i<processes.length;i++)
    		processes[i].weight=processes[i].weight/c;
    }
    
    public void resetTimes() {
    	for(int i=0;i<processes.length;i++)
    		processes[i].times=0;
    }
}
