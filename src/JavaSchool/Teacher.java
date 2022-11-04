package JavaSchool;

import java.util.List;

public class Teacher {

    private String fullName;

    private String address;

    private String email;

    private int phoneNo;

    private int salary;

    public List <String> subjectsTaught;

    public List<String> classesTaught;

    public Teacher(String fullName, String address, String email, int phoneNo, int salary, List<String> subjectsTaught, List<String> classesTaught) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.subjectsTaught = subjectsTaught;
        this.classesTaught = classesTaught;
    }
}
