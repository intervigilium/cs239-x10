#!/bin/bash

export JAVA_HOME=/usr/java/jdk1.6.0_04
rm *.class
/project/jkenl/x10/x10.common/bin/x10c MapReduce.x10
/project/jkenl/x10/x10.common/bin/x10 MapReduce
/project/jkenl/x10/x10.common/bin/x10c Series.x10
/project/jkenl/x10/x10.common/bin/x10 Series

