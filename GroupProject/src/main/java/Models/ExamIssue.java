package Models;

public class ExamIssue {
   
    private String S_Id;
    private String S_Name;
    private String Mail;
    private int ContactNo;
    private String SubName;
    private String SubCode;
    private String ExamIssue;
    private String TimeIssue;
    private String CompleteExam;
    
    public ExamIssue(String S_Id,String S_Name,String Mail,int ContactNo,String SubName,String SubCode,String ExamIssue,String TimeIssue,String CompleteExam)
    {
        
        this.S_Id= S_Id;
        this.S_Name=S_Name;
        this.Mail=Mail;
        this.ContactNo=ContactNo;
        this.SubName=SubName;
        this.SubCode=SubCode;
        this.ExamIssue=ExamIssue;
        this.TimeIssue=TimeIssue;
        this.CompleteExam=CompleteExam;
        
    }

    public String getS_Id() {
        return  S_Id;
    }

    public void setS_Id(String  S_Id) {
        this.S_Id =  S_Id;
    }

    public String getS_Name() {
        return S_Name;
    }

    public void setS_Name(String S_Name) {
        this.S_Name = S_Name;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getSubName() {
        return SubName;
    }

    public void setSubName(String SubName) {
        this.SubName = SubName;
    }

    public String getSubCode() {
        return SubCode;
    }

    public void setSubCode(String SubCode) {
        this.SubCode = SubCode;
    }

    public String getExamIssue() {
        return ExamIssue;
    }

    public void setExamIssue(String ExamIssue) {
        this.ExamIssue = ExamIssue;
    }

    public String getTimeIssue() {
        return TimeIssue;
    }

    public void setTimeIssue(String TimeIssue) {
        this.TimeIssue = TimeIssue;
    }

    public String getCompleteExam() {
        return CompleteExam;
    }

    public void setCompleteExam(String CompleteExam) {
        this.CompleteExam = CompleteExam;
    }

    
    
}
