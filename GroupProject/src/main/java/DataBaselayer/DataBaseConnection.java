package DataBaselayer;

import Models.ExamIssue;
import Models.RegisterIssues;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnection {

    PreparedStatement statement;

    private final String URL = "jdbc:mysql://localhost:3306/tutoragroup?useSSL=false";
    private final String Uname = "root";
    private final String Password = "";
    private static DataBaseConnection instance;
    private Connection con;

    private DataBaseConnection() {
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

    public static DataBaseConnection getSingleInstace() {
        try {
            if (instance == null) {
                instance = new DataBaseConnection();
            } else if (instance.con.isClosed()) {
                instance = new DataBaseConnection();
            } else {
                return instance;
            }
            return instance;
        } catch (SQLException ex) {
            System.out.println("Database Connection ERROR " + ex.getMessage());
            return null;
        }
    }

    public boolean ExecuteQuery(String sqlQ, RegisterIssues student) {
        try {
            String contactNo = String.valueOf(student.getContactNo());
            String year = String.valueOf(student.getYear());
            statement = con.prepareStatement(sqlQ);

            statement.setString(1, student.getStudent_Id());
            statement.setString(2, student.getStudent_Name());
            statement.setString(3, student.getMail());
            statement.setString(4, contactNo);
            statement.setString(5, student.getProgram());
            statement.setString(6, student.getBranch());
            statement.setString(7, year);
            statement.setString(8, student.getSemester());
            statement.setString(9, student.getDescribe_Issues());

            int result = statement.executeUpdate();
            con.close();
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }
    }

    public boolean DeleteQuery(String deletesqlQ, String Student_Id) {
        try {

            statement = con.prepareStatement(deletesqlQ);
            statement.setString(1, Student_Id);

            int result = statement.executeUpdate();
            con.close();
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }

    }

    public boolean UpdateQuery(String updatesqlQ, RegisterIssues student) {
        try {
            String contactNo = String.valueOf(student.getContactNo());
            String year = String.valueOf(student.getYear());
            statement = con.prepareStatement(updatesqlQ);

            //statement.setString(1, student.getStudent_Id());
            statement.setString(1, student.getStudent_Name());
            statement.setString(2, student.getMail());
            statement.setString(3, contactNo);
            statement.setString(4, student.getProgram());
            statement.setString(5, student.getBranch());
            statement.setString(6, year);
            statement.setString(7, student.getSemester());
            statement.setString(8, student.getDescribe_Issues());

            int result = statement.executeUpdate();
            con.close();
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }

    }

    public boolean ExecuteexamQuery(String sqlQ, ExamIssue exam) {
        try {
            String contactNo = String.valueOf(exam.getContactNo());

            statement = con.prepareStatement(sqlQ);

            statement.setString(1, exam.getS_Id());
            statement.setString(2, exam.getS_Name());
            statement.setString(3, exam.getMail());
            statement.setString(4, contactNo);
            statement.setString(5, exam.getSubName());
            statement.setString(6, exam.getSubCode());
            statement.setString(7, exam.getExamIssue());
            statement.setString(8, exam.getTimeIssue());
            statement.setString(9, exam.getCompleteExam());

            int result = statement.executeUpdate();
            con.close();
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }
    }

    public boolean DeleteExamQuery(String deletesqlE, String S_Id) {
        try {

            statement = con.prepareStatement(deletesqlE);
            statement.setString(1, S_Id);

            int result = statement.executeUpdate();
            con.close();
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }

    }

    public boolean UpdateExamQuery(String updatesqlQ, ExamIssue exam) {
        try {
            String contactNo = String.valueOf(exam.getContactNo());

            statement = con.prepareStatement(updatesqlQ);

            //  statement.setString(1, exam.getS_Id());
            statement.setString(1, exam.getS_Name());
            statement.setString(2, exam.getMail());
            statement.setString(3, contactNo);
            statement.setString(4, exam.getSubName());
            statement.setString(5, exam.getSubCode());
            statement.setString(6, exam.getExamIssue());
            statement.setString(7, exam.getTimeIssue());
            statement.setString(8, exam.getCompleteExam());

            int result = statement.executeUpdate();
            con.close();
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }

    }

}
