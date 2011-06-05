# Makefile

JAVAC = javac
JAVA = java

OUT = Main
SRC = ${OUT}.java
INPUT_DIR = x10
INPUT_FILE = Series.x10

all: run

build:
	${JAVAC} ${SRC}

run: build
	${JAVA} ${OUT} < ./${INPUT_DIR}/${INPUT_FILE}

clean:
	rm *.class
