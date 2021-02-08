# DatabaseIsolation-Glaucus
consistently increment a number in a database when parallel threads are racing to increment the number.<br>
Create a table Number in MySQL database with one integer type field.<br>
Create a RESTful API using Spring MVC architecture that increments this number.<br>
Use Jmeter (Do not use postman because it does not send parallel requests) to call this API with 5000 users so that a lot of parallel requests are sent to server to increment the number.<br>
Now set the initial value of Number to 0.<br>
After the execution of Jmeter, the value of the number in the database shall be 5000. (Try the same with a bigger number 100000)<br>
The API should be scalable i.e. if deployed on multiple machines with same database, the result should be consistent.<br><br>

Steps to run this application:<br>
step 1: After code checkout, import on your IDE and click on maven update.<br>
step 2: change database connection parameter (like url, user, password, schema name in url ) in application.properties.<br>
step 3: Import database from .sql file added in SQL folder of the repository. (table name: numberincrement)<br>
Step 4: Run the application (	Run As -> Run as spring boot application).<br>
Step 5: open jmeter and open "POST_NumberIncrement.jmx"(inside JMX folder of repo). (File -> open and choose "POST_NumberIncrement.jmx" ).<br>
Step 6: verify port no and protocol(http/https). For me, it's http and 8980. (URL: http://localhost:8980/increment).<br>
Step 7: click on start button.<br>
Step 8: verify view Result tree for any failure.<br>
step 9: verify count incremented consistently: http://localhost:8980/getCount<br>
