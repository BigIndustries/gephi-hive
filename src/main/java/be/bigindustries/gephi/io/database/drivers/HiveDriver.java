package be.bigindustries.io.database.drivers;

import org.gephi.io.database.drivers.SQLDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Robert Gibbon
 */
@ServiceProvider(service = SQLDriver.class, position = 10)
public class HiveDriver implements SQLDriver {

    public static String driverName = "org.apache.hive.jdbc.HiveDriver";

    public HiveDriver() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiveDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Connection getConnection(String connectionUrl, String username, String passwd) throws SQLException {
        return DriverManager.getConnection(connectionUrl, username, passwd);
    }

    @Override
    public String getPrefix() {
        return "hive2";
    }

    @Override
    public String toString() {
        return "Hive";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HiveDriver) {
            return ((HiveDriver) obj).getPrefix().equals(getPrefix());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrefix().hashCode();
    }
}
