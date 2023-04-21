package DataBaseAccesslayer;

import DataBaselayer.DataBaseConnection;
import Models.RegisterIssues;
import java.sql.Connection;

public class StudentAccessLogic {

    private final DataBaseConnection singleconn;
    Connection con;

    public StudentAccessLogic() {
        singleconn = DataBaseConnection.getSingleInstace();
    }

    public boolean addStudentTODB(RegisterIssues student) {
        try {
            String insertData = "insert into student(Student_Id,Student_Name,Mail,ContactNo, Program, Branch, Year, Semester, Describe_Issues) values(?,?,?,?,?,?,?,?,?)";
            boolean result = singleconn.ExecuteQuery(insertData, student);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean deleteStudentTODB(String Student_Id) {
        try {
            String deleteData = "DELETE FROM student WHERE Student_Id  = ?";
            boolean result = singleconn.DeleteQuery(deleteData, Student_Id);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean updatestudentTODB(RegisterIssues student) {
        try {
            String upDateData = "UPDATE student SET "
                    + "Student_Name = ?,"
                    + "Mail = ?,"
                    + "ContactNo = ?,"
                    + "Program = ?,"
                    + "Branch = ?,"
                    + "Year = ?,"
                    + "Semester = ?,"
                    + "Describe_Issues = ?"
                    + "WHERE Student_Id ='" + student.getStudent_Id() + "'";
            boolean result = singleconn.UpdateQuery(upDateData, student);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

}
