@echo off

del classpath

javac -sourcepath src/javaapplication1 -d classpath src/javaapplication1/JavaApplication1.java

jar cvfm Java1.jar MANIFEST.MF -C classpath .

@rem java -classpath classpath calc.Calc

java -jar Java1.jar

pause