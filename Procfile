web: java $JAVA_OPTS -jar target/dependency/jetty-runner.jar \
--port $PORT \
-Djavax.persistence.jdbc.driver=org.postgresql.Driver \
-Djavax.persistence.jdbc.url=$JDBC_DATABASE_URL \
-Djavax.persistence.jdbc.user=$JDBC_DATABASE_USERNAME \
-Djavax.persistence.jdbc.password=$JDBC_DATABASE_PASSWORD \
-Declipselink.target-database=io.mateu.common.model.util.MiPostgreSQLPlatform \
target/*.war