#!/bin/bash

javac -cp .:junit-4.13.1.jar:hamcrest-core-1.3.jar Tests.java

java -cp .:junit-4.13.1.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore Tests
#     ^  ^^^                ^
#     |  |||                Hamcrest is used to do more interesting pattern matching, you likely won't need it
#     |  ||JUnit is the unit test framework
#     |  |a `:` is used to separate classes
#     |  include the current folder
#     changes the class path (the location of all the classes used to run this code)
