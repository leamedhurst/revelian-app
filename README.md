# revelian-app
1.1	Purpose
The purpose of this document is to communicate the usage of the Calculate Pi Code Challenge.
1.2	Scope
The Scope of this document is limited to the Java and Maven project that is part of the code challenge
1.3	Intended Audience
The intended audience of this document is the technical team at Revelian.


2.	Overview
The task was to calculate the value of Pi using the supplied formula.
 

3.	Source Code
The application is written in Java.
The code can be found in the attached file revelian-app.zip or online at https://github.com/leamedhurst/revelian-app

4.	Build the Code
The build tool used for this project was maven. You will require maven to build the project.
Once maven is installed then change to the unzipped source code and type mvn package
Then to run your changes java -cp target/revelian-app-1.0-SNAPSHOT.jar com.revelian.lea.App

5.	Run the Code Without a Build
Place the included revelian-app.jar on your file system. Ensure Java is installed.
Then type java -cp <filepath>/ revelian-app.jar com.revelian.lea.App

6.	Change the Number of Iterations the value of Pi is calculated to

Unzip the Jar file, change the value in config.properties to any valid number. Re Zip and rerun, the default is 10000
