package DataAccessLayer;
import DatabaseLayer.DatabaseConnection;
import Models.College;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class CollegeAccessLogic {
    
    private DatabaseConnection singleConn;
    Connection con;
    PreparedStatement statement;
    
    public CollegeAccessLogic()
    {
        singleConn = DatabaseConnection.getSingleInstace();
    }
    
    public boolean addStudentTODB(College college) {
        try {
            String insertData = "insert into college (S_Name,Age,School) values(?,?,?)"; 
          //  boolean result = singleConn.ExecuteQuery(query);
          boolean result = singleConn.ExecuteQuery(insertData, college);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean deleteStudentTODB(String name) {
        try {
            String deleteData = "DELETE FROM college WHERE S_Name  = ?";
          //  boolean result = singleConn.ExecuteQuery(query);
          boolean result = singleConn.DeleteQuery(deleteData, name);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
     public boolean updatestudentTODB(College college) {
        try {
            String upDateData = "UPDATE college SET "
                                  +"Age = ?,"
                                  +"School = ?"
                                  +"WHERE S_Name ='" + college.getS_Name() + "'";
          //  boolean result = singleConn.ExecuteQuery(query);
          boolean result = singleConn.UpdateQuery(upDateData, college);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
   
    
    
  
}
