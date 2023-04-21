package Models;

public class RegisterIssues {
    
    private String Student_Id;
    private String Student_Name;
    private String Mail;
    private int ContactNo;
    private String Program;
    private String Branch;
    private int Year;
    private String Semester;
    private String Describe_Issues;

    public RegisterIssues( String Student_Id, String Student_Name,String Mail, int ContactNo, String Program, String Branch, int Year, String Semester, String Describe_Issues) {

        
        this.Student_Id = Student_Id;
        this.Student_Name = Student_Name;
        this.Mail = Mail;
        this.ContactNo = ContactNo;
        this.Program = Program;
        this.Branch = Branch;
        this.Year = Year;
        this.Semester = Semester;
        this.Describe_Issues = Describe_Issues;
    }

    public String getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(String Student_Id) {
        this.Student_Id = Student_Id;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String Student_Name) {
        this.Student_Name = Student_Name;
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

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getDescribe_Issues() {
        return Describe_Issues;
    }

    public void setDescribe_Issues(String Describe_Issues) {
        this.Describe_Issues = Describe_Issues;
    }

    

}
