package DatabaseLayer;
import Models.College;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseConnection {
    
    PreparedStatement statement;
    
    private final String URL = "jdbc:mysql://localhost:3306/school?useSSL=false";
    private final String Uname = "root";
    private final String Password = "";
    private static DatabaseConnection instance;
    private Connection con;
    
    private DatabaseConnection()
    {
     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, Uname, Password);
            System.out.println("Connection Success");
        } catch (SQLException ex) {
            System.out.println("Database Connection ERROR " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver class Error " + ex.getMessage());
        }
    }
    
    public static DatabaseConnection getSingleInstace() {
        try {
            if (instance == null) {
                instance = new DatabaseConnection();
            } else if (instance.con.isClosed()) {
                instance = new DatabaseConnection();
            } else {
                return instance;
            }
            return instance;
        } catch (SQLException ex) {
            System.out.println("Database Connection ERROR " + ex.getMessage());
            return null;
        }
    }

    public boolean ExecuteQuery(String sqlQ,College college) {
        try {
            String age = String.valueOf(college.getAge());
            statement = con.prepareStatement(sqlQ);
            statement.setString(1, college.getS_Name());
            statement.setString(2, age);
            statement.setString(3, college.getSchool());
            
            
            int result=statement.executeUpdate();
            
            return result>0;
        } catch (SQLException ex) {
            System.out.println("SQL Error "+ex.getMessage());
            return false;
        }
        
    }
    
    public boolean DeleteQuery(String deletesqlQ,String name)
    {
         try {
            
            statement = con.prepareStatement(deletesqlQ);
            statement.setString(1, name);
            //statement.setString(1, age);
           //statement.setString(2, college.getSchool());
           
            int result=statement.executeUpdate();
            
            return result>0;
        } catch (SQLException ex) {
            System.out.println("SQL Error "+ex.getMessage());
            return false;
        }
        
    }
    
     public boolean UpdateQuery(String updatesqlQ,College college)
    {
         try {
            String age = String.valueOf(college.getAge());
            statement = con.prepareStatement(updatesqlQ);
            //statement.setString(1, college.getS_Name());
            statement.setString(1, age);
            statement.setString(2, college.getSchool());
        
            int result=statement.executeUpdate();
          
            return result>0;
        } catch (SQLException ex) {
            System.out.println("SQL Error "+ex.getMessage());
            return false;
        }
        
    }
    
    
}
