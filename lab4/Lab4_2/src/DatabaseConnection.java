import java.sql.*;
import java.util.HashMap;

public class DatabaseConnection {
    private Connection connection;
    public DatabaseConnection(){
        this.connection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:./Sqlite/test.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
    public String[] getViaId(int id){
        String sql = "SELECT * FROM Cars WHERE ID=" + String.valueOf(id);
        try {

             Statement stmt  = this.connection.createStatement();
             ResultSet rs    = stmt.executeQuery(sql);
             return new String[]{rs.getString("Name"),rs.getString("Creator"),
                     rs.getString("Power"),rs.getString("Image")};

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return new String[0];
    }
    public HashMap<String,Integer>getAllNamesAndId(){
        HashMap<String,Integer> dict = new HashMap<>();
        String sql = "SELECT * FROM Cars ORDER BY ID ASC";
        try {

            Statement stmt  = this.connection.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            while(rs.next()){
                dict.put(rs.getString("Name"),rs.getInt("ID"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dict;
    }
}
