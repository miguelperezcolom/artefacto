##web: java $JAVA_OPTS -jar target/dependency/jetty-runner.jar --port $PORT target/*.war
##web: java $JAVA_OPTS  -Djavax.persistence.jdbc.driver=org.postgresql.Driver -Djavax.persistence.jdbc.url=$JDBC_DATABASE_URL -Djavax.persistence.jdbc.user=$JDBC_DATABASE_USERNAME -Djavax.persistence.jdbc.password=$JDBC_DATABASE_PASSWORD -Declipselink.target-database=io.mateu.common.model.util.MiPostgreSQLPlatform -jar target/dependency/jetty-runner.jar --port $PORT target/*.war
web: java $JAVA_OPTS  -Djavax.persistence.jdbc.driver=org.postgresql.Driver -Djavax.persistence.jdbc.url=$DATABASE_URL -Djavax.persistence.jdbc.user=$DATABASE_USERNAME -Djavax.persistence.jdbc.password=$DATABASE_PASSWORD -Declipselink.target-database=io.mateu.common.model.util.MiPostgreSQLPlatform -jar target/dependency/jetty-runner.jar --port $PORT target/*.war