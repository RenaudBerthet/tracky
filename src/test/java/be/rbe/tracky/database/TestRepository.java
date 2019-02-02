package be.rbe.tracky.database;

import org.flywaydb.core.Flyway;

public class TestRepository {

    public static final String DATABASE_URL = "jdbc:h2:file:./target/foobar";
    public static final String FLYWAY_USERNAME = "sa";
    public static final String FLYWAY_PASSWORD = null;

    public static void clear() {
        Flyway flyway = Flyway.configure().dataSource(DATABASE_URL, FLYWAY_USERNAME, FLYWAY_PASSWORD).load();
        flyway.clean();
    }

    public static void init() {
        Flyway flyway = Flyway.configure().dataSource(DATABASE_URL, FLYWAY_USERNAME, FLYWAY_PASSWORD).load();
        flyway.clean();
        flyway.migrate();
    }

}
