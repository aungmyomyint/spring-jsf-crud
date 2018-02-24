# spring-jsf-crud
Spring, JSF, MySQL

#Installation

Requirements:
- JDK 8.
- Maven.
- Database, such as MySQL.
- Web server, such as Apache Tomcat 8.0

* **applicationContext.xml** files (in `src\main\resources\spring directory`) contain database configuration: database driver, address, name, username/password, ...
  
    <pre>&lt;bean id="hikariConfig" class="hikariConfig""&gt;
        &lt;property name="dataSourceProperties"&gt;
            &lt;props&gt;
              &lt;prop key="url"&gt; "jdbc:<b>mysql://localhost:3306/student</b>..."
              &lt/prop&gt;
              &lt;prop key="user"&gt; "<b>root</b>" &lt/prop&gt;
              &lt;prop key="password"&gt; "<b>root</b>" &lt/prop&gt;
              ...
         ...
     ...<pre>
 
 
* **student.sql** files (in `src\main\resources\sql directory`) contain DDL and DML query for sample data.
