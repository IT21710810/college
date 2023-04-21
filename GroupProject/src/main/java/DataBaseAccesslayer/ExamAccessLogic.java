package DataBaseAccesslayer;

import DataBaselayer.DataBaseConnection;
import Models.ExamIssue;
import java.sql.Connection;

public class ExamAccessLogic {

    private final DataBaseConnection singleconn;
    Connection con;

    public ExamAccessLogic() {
        singleconn = DataBaseConnection.getSingleInstace();
    }

    public boolean addExamToDB(ExamIssue exam) {
        try {
            String insertData = "insert into exam ( S_Id,S_Name,Mail,ContactNo,SubName, SubCode,ExamIssue, TimeIssue,CompleteExam) values(?,?,?,?,?,?,?,?,?)";
            boolean result = singleconn.ExecuteexamQuery(insertData, exam);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean deleteExamToDB(String S_Id) {
        try {
            String deleteData = "DELETE FROM exam WHERE S_Id = ?";
            boolean result = singleconn.DeleteExamQuery(deleteData, S_Id);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean updateExamToDB(ExamIssue exam) {
        try {
            String upDateData = "UPDATE exam SET "
                    + "S_Name = ?,"
                    + "Mail = ?,"
                    + "ContactNo = ?,"
                    + "SubName = ?,"
                    + "SubCode = ?,"
                    + "ExamIssue = ?,"
                    + "TimeIssue = ?,"
                    + "CompleteExam = ?"
                    + "WHERE S_Id ='" + exam.getS_Id() + "'";
            boolean result = singleconn.UpdateExamQuery(upDateData, exam);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

}
