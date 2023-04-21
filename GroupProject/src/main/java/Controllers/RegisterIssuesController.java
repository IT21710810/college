package Controllers;
import Models.RegisterIssues;
import DataBaseAccesslayer.StudentAccessLogic;
public class RegisterIssuesController {
    RegisterIssues registerobj;
    StudentAccessLogic bal;
     
    public RegisterIssuesController()
    {
        bal=new StudentAccessLogic();
    }
    
    public RegisterIssues addRegister(String Student_Id,String Student_Name,String Mail,int ContactNo,String Program,String Branch,int Year,String Semester,String Describe_Issues)
    {
        registerobj = new RegisterIssues( Student_Id,Student_Name, Mail, ContactNo, Program, Branch, Year, Semester, Describe_Issues);
        return registerobj;
    }
    public boolean insertStudentToDB(RegisterIssues student)
    {
        boolean result=bal.addStudentTODB(student);
        return  result;
    }
    public boolean removeStudentToDB(String Student_Id)
    {
        boolean result = bal.deleteStudentTODB(Student_Id);
        return result;
    }
    public boolean updateStudentToDB(RegisterIssues studentU) {
        boolean result =bal.updatestudentTODB(studentU);
        return result;
    }
  
}
