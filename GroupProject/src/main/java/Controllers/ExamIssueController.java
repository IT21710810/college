package Controllers;
import Models.ExamIssue;
import DataBaseAccesslayer.ExamAccessLogic;

public class ExamIssueController {
    ExamIssue examobj;
    ExamAccessLogic bal;
    
    public ExamIssueController()
    {
        bal=new ExamAccessLogic();
    }
    
    public ExamIssue addExamIssue(String  S_Id,String S_Name, String Mail,int ContactNo,String SubName,String SubCode,String ExamIssue,String TimeIssue,String CompleteExam)
    {
        examobj=new ExamIssue( S_Id,S_Name,Mail,ContactNo,SubName,SubCode,ExamIssue,TimeIssue,CompleteExam);
        return examobj;
    }
    
    public boolean insertExamToDB(ExamIssue exam)
    {
        boolean result=bal.addExamToDB(exam);
        return  result;
    }
    
    public boolean removeExamToDB(String S_Id)
    {
        boolean result = bal.deleteExamToDB(S_Id);
        return result;
    }
    
    public boolean updateExamToDB(ExamIssue exam) {
        boolean result =bal.updateExamToDB(exam);
        return result;
    }

    
   
}
