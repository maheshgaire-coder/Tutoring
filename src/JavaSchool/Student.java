package JavaSchool;

public class Student {
    private String name;
    private  String email;
    private int phoneNo;
    private String height;
    private Marksheet markSheet;

    Student (String name, String email,int phoneNo, String height, Marksheet markSheet) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.height = height;
        this.markSheet = markSheet;

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
        return markSheet.getGpa();
    }


}
