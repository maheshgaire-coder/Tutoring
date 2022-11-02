package JavaSchool;

import java.util.List;

public class ClassRoom {
    private int noOfStudent;
    private String nameOfClass;
    private int numberOfSections;

    private List<Section> sections;

    ClassRoom (int noOfStudent, String nameOfClass, List<Section> sections){
        this.noOfStudent = noOfStudent;
        this.nameOfClass = nameOfClass;
        this.numberOfSections = sections.size();
        this.sections = sections;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }
    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }
    public String getNameOfClass() {
        return nameOfClass;
    }
    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }
    public int getNumberOfSections() {
        return numberOfSections;
    }
    public void setNumberOfSections(int numberOfSections) {
        this.numberOfSections = numberOfSections;
    }
}
