import java.sql.*;

/**
 * Created by name on 2016/6/2.
 */
public class JDBCTest {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/fanhe";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connecting to database..");
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, img_url, name, descr FROM z_first";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
            int id = rs.getInt("id");
            String imgUrl = rs.getString("img_url");
            String name = rs.getString("name");
            String descr = rs.getString("descr");
            System.out.print("ID: " + id);
            System.out.print(", imgUrl: " + imgUrl);
            System.out.print(", name: " + name);
            System.out.println(", descr: " + descr);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }
}
