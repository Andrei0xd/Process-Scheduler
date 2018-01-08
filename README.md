# JAVA Process Scheduler

Process Scheduler that takes up to 7 processes and schedules them accordingly. Also uses a software simulated cache so 
that it won't compute least frequent/least recent results.


### Information:
Processes that it takes : CheckPrime, NextPrime, Fibonacci, Sqrt, Cube, Factorial
Types of scheduling : Random, Round Robin, Weighted.
Types of cache : LRU, LFU.


## Input example:


```

		CacheType
		CacheLines
		SchedulerType
		NumberOfEvents
		Process1 Weight1
		…
		LastProcess LastWeight
		NumberOfNumbersToBeProcessed
		Number1
		…
		LastNumber

```


## Accepted input:

CacheType can be: "LFU" / "LRU" / "NoCache"

CacheLines is the size of the cache

SchedulerType can be : "RandomScheduler" / "RoundRobinScheduler" / "WeightedScheduler"






