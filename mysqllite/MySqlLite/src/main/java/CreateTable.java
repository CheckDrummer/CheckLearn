import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	 
    /**
     * Create a new table in the test database
     *
     */
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:D://Check/db/test.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS inventory (\n"              
                + " warehouse_id integer PRIMARY KEY,\n"
                + "	material_id integer NOT NULL,\n"
                + "	qty real\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewTable();
    }
 
}
