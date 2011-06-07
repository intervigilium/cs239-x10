# Makefile

JAVAC = javac
JAVA = java

OUT = Main
SRC = ${OUT}.java
INPUT_DIR = x10
INPUT_FILE = MapReduce.x10

all: build

build:
	${JAVAC} ${SRC}

run: build
	${JAVA} ${OUT} < ./${INPUT_DIR}/${INPUT_FILE}

clean:
	rm *.class
	rm syntaxtree/*.class
	rm visitor/*.class
	rm cs239/*.class
