# DatabaseIsolation-Glaucus
consistently increment a number in a database when parallel threads are racing to increment the number.
Create a table Number in MySQL database with one integer type field.
Create a RESTful API using Spring MVC architecture that increments this number.
Use Jmeter (Do not use postman because it does not send parallel requests) to call this API with 5000 users so that a lot of parallel requests are sent to server to increment the number.
Now set the initial value of Number to 0.
After the execution of Jmeter, the value of the number in the database shall be 5000. (Try the same with a bigger number 100000)
The API should be scalable i.e. if deployed on multiple machines with same database, the result should be consistent.

Steps to run this application:
step 1: After code checkout, import on your IDE and click on maven update.
step 2- change database connection parameter (like url, user, password, schema name in url ) in application.properties. 
Step-4- Run the application (	Run As -> Run as spring boot application)
Step 5-  open jmeter and open "POST_NumberIncrement.jmx". (File -> open and choose "POST_NumberIncrement.jmx" )
Step -6  verify port no and protocol(http/https). For me, it's http and 8980. (URL: http://localhost:8980/increment)
Step-8 click on start button.
Step-9 verify view Result tree for any failure. 
step 10: verify count incremented consistently: http://localhost:8980/getCount
