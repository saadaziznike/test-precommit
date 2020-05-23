APKDJG5J357308:src saziz$ javac com/javaindepth/basics/*.java
APKDJG5J357308:src saziz$ java com.javaindepth.basics.PracticeRecursion
3 2 1 1 2 3 APKDJG5J357308ls
com
APKDJG5J357308:src saziz$ 

To run tests
export JUNIT_HOME=~/src
export CLASSPATH = $CLASSPATH:$JUNIT_HOME/junit-4.13.jar:.;
export CLASSPATH=$CLASSPATH:/users/saziz/src/hamcrest-2.2.jar:.

https://www.tutorialspoint.com/junit/junit_executing_tests.htm


to verify what exists in classpath, use env command

Laundry List


X Compile source code
X Run Main program
X Generate System.out.print for debugging messages
X Run JUnit tests
  Gated check in for source code
  Upon successful commit, deploy to CICD Environment


Git
J5iiBm7aKGZb6mg

git add *.java
git commit -m "Initial commit"
git status

git push
