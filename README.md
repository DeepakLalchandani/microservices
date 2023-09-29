# microservices

Git's Important command 

A. To add a project from a local computer to git-hub

    1 Initialize Git in your local project directory:
      Open your terminal(in any IDE) or command prompt. -> Navigate to the root directory of your project.
       "git init"
    
    2. Add your project files to the Git repository:
       "git add ."
       
    3. Commit your changes:
        git commit -m "Your commit message here"

    4. Connect your local repository to the GitHub repository:
        In the GitHub repository you created, you will find the URL for your remote repository.
        Copy it (should look something like https://github.com/your- username/your-repo.git). 
        Now, in your terminal, link your local repository to the remote GitHub repository using the following command:
        
        "git remote add origin https://github.com/your-username/your-repo.git"
        
    5. Push your local repository to GitHub:
        Finally, use the following command to push your local repository to GitHub:
         "git push -u origin master"

 B. Database-connection -MY Sql
 
    spring.datasource.url=jdbc:mysql://localhost:3306/databse_name
    spring.datasource.username=root(username)
    spring.datasource.password=root(password)
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

 C. JPA Setting

    spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
    spring.jpa.hibernate.ddl-auto=none   
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true







     

