#!/bin/sh

##               no toString, no hashcode equals,  big decimals for double, long instead of int, version 1.8, serializable, -ds=disableSetters
jsonschema2pojo -S -E --big-decimals  -l -tv 1.8 --serializable  --remove-old-output  --package 'com.studerw.tda' --target-language JAVA --source json_source/todo  --target java_out -ds


