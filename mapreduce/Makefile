# Makefile

X10 = x10
X10J = x10c
X10CPP = x10c++
OUT = MapReduce
SRC = ${OUT}.x10

all: cpp

java:
	${X10J} ${SRC}

cpp:
	${X10CPP} ${SRC} -o ${OUT}

run-cpp: cpp
	./${OUT}

run-java: java
	${X10} ${OUT}

clean:
	rm *.class *.java *.cc *.h ${OUT}
