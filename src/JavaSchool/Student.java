package JavaSchool;

public class Student {
    private String name;
    private  String email;
    private int phoneNo;
    private String height;
    private double gpa;

    Student (String name, String email,int phoneNo, String height, double gpa) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.height = height;
        this.gpa = gpa;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
