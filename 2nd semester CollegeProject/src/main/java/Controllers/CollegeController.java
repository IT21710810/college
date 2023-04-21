package Controllers;
import Models.College;
import DataAccessLayer.CollegeAccessLogic;
public class CollegeController {
    College ObjCollege;
    CollegeAccessLogic bal;
    
    public CollegeController()
    {
        bal = new CollegeAccessLogic();
    }
    
    public College addStudent(String S_Name,int Age,String School) {
        ObjCollege = new College(S_Name, Age, School);
        return ObjCollege;
    }
    
    public boolean insertStudentToDB(College col) {
        boolean result = bal.addStudentTODB( col);
        return result;
    }
    
    public boolean removeStudentToDB(String name) {
        boolean result = bal.deleteStudentTODB(name);
        return result;
    }
    
     public boolean updateStudentToDB(College colU) {
        boolean result =bal.updatestudentTODB(colU);
        return result;
    }
    
    

}
