package JavaSchool;

import java.util.List;

public class Section {
    private String nameOfSection;
    private int numOfStudent;
    private double averageGPA;

    private List<Student> students;



    public Section (String nameOfSection, List<Student> students){
        this.nameOfSection = nameOfSection;
        this.averageGPA = getGpa(students);
        this.numOfStudent = students.size();
        this.students = students;

    }


    private double getGpa(List<Student> students) {
        // TODO Auto-generated method stub
        double total = 0.0;
        for(Student s: students) {
            total+= s.getGpa();
        }
        return total/students.size();
    }


    public String getNameOfSection() {
        return nameOfSection;
    }
    public void setNameOfSection(String nameOfSection) {
        this.nameOfSection = nameOfSection;
    }
    public int getNumOfStudent() {
        return students.size();
    }
    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }
    public double getAverageGPA() {
        return averageGPA;
    }
    public void setAverageGPA(double averageGPA) {
        this.averageGPA = averageGPA;
    }
}
