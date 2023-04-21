package Models;

public class College {
    private String S_Name;
    private int Age;
    private String School;
   
    
    public College(String S_Name,int Age,String School)
    {
        this.S_Name=S_Name;
        this.Age=Age;
        this.School=School;
    }
    public String getS_Name() {
        return S_Name;
    }

    public void setS_Name(String S_Name) {
        this.S_Name = S_Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }
    
}
