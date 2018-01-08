.PHONY: build clean run

build: tema1

run:
	java -Xmx1G Scheduler.Main ${ARGS}

tema1:
	javac *.java -d .

clean:
	rm -rf *.class
