package JavaSchool;

import java.util.ArrayList;
import java.util.List;

public class MaheshSchool {
    public static void main(String [] args) {

        Student S1= new Student("Ram", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", 3.0);
        Student S2= new Student("Shyam", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", 3.4);
        Student S3= new Student("Hari", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", 3.5);
        Student S4= new Student("Sani", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", 3.7);
        Student S5= new Student("Krihna", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", 2.5);
        Student S6= new Student("Priya", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", 4.0);
        Student S7= new Student("Supriya", "ramlimbu@gmail.com", 7574242, "5 ft 6 inch", 0.0);
        List<Student> section1 = new ArrayList<>();
        section1.add(S1);
        section1.add(S2);
        section1.add(S3);
        section1.add(S4);
        List<Student> section2 = new ArrayList<>();
        section2.add(S5);
        section2.add(S6);
        section2.add(S7);
        List<Section> class5sections = new ArrayList<>();
        Section section_1= new Section("Section 1", section1 );
        System.out.println("average GPA of " + section_1.getNameOfSection() + " is " + section_1.getAverageGPA());
        Section section_2= new Section("Section 2", section2 );
        System.out.println("average GPA of " + section_2.getNameOfSection() + " is " + section_2.getAverageGPA());
        class5sections.add(section_1);
        class5sections.add(section_2);

        ClassRoom class1 = new ClassRoom(7, "class5", class5sections);
    }

}
