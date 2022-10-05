import java.sql.*;
/**
 *
 * @author postgresqltutorial.com
 */
public class Model{

    // These are the credentials for the database connection
    private final String url = "jdbc:postgresql://ec2-44-207-133-100.compute-1.amazonaws.com:5432/d9gs6fbgajrr5h?sslmode=require";
    private final String user = "kqmxvinhydttmo";
    private final String password = "66b9145075195cf7e932d1c515dc3b91b58bd987ec2649b7512fd58e4591c0d6";
    Connection connection;
    String storedCodeName, storedID;

    // Constructor for the model class
    public Model()
    {
        connection = connect();
    }

    /**
     * Connect to the PostgreSQL database
     *
     *set a local variable to a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
         }
         catch (ClassNotFoundException e) {
            System.err.println (e);
            System.exit (-1);
         }
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Store codename and return True or false
    public Boolean Search(String id)
    {
        // Write the query that will be used to search for the passed in id
        String query = String.format("Select codename from player where id=%s", id);
        storedID = id;
        try {
            // create a statement
            Statement stmt = connection.createStatement();
            // execute statement and gather a result set
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                // get codename and store it as a variable for later
                String codeName = rs.getString("codename");
                System.out.println(codeName);
                storedCodeName = codeName;
                // return that the search was successful
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // If here it means an exception was thrown and the search was unsuccessful
        return false;
    }

    // Send the codename to the presenter
    public String getCodeName()
    {
        return storedCodeName;
    }

    // Add the codename and id pair to the database
    public void addCodeName(String id, String CodeName)
    {
        // Write the query that will be used to add the codenmae for the earlier passed in id
        String query = String.format("INSERT INTO player(id, codename) " +
                                    "Values (%s, '%s')", id, CodeName);
        try {
            // Create a statement
            Statement stmt = connection.createStatement();
            // Execute the statement
            stmt.executeUpdate(query);
            // Print that it was successful
            System.out.println("Successful");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
