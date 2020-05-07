# northgate
git clone http://github.com/CharlieSwires/northgate
mvn install:install-file -Dfile=jackson-core-asl-1.9.13.jar
mvn install:install-file -Dfile=jackson-mapper-asl-1.9.13.jar
set JAVA_HOME=C\:/Program\ Files/Java/jdk1.8.0_162/bin/
mvn package

Import as an eclipse project from git run from eclipse
