package controller;

import java.util.ArrayList;
import java.util.List;
import model.Agreement;
import model.Course;
import model.Enrollment;
import model.Student;
import model.enume.Sexo;

/**
 *
 * @author cero
 */
public class Exec {

    private final List<Course> courseList;
    private final List<Student> studentList;
    private final List<Agreement> agreementList;
    private final List<Enrollment> enrollmentList;

    public Exec() {
        courseList = new ArrayList<>();
        studentList = new ArrayList<>();
        agreementList = new ArrayList<>();
        enrollmentList = new ArrayList<>();
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Agreement> getAgreementList() {
        return agreementList;
    }

    public List<Enrollment> getEnrollmentList() {
        return enrollmentList;
    }

    public void createCourse(String name, double enrollment, double tariff, byte time) {
        Course c = new Course(name, enrollment, tariff, time);
        courseList.add(c);
    }

    public void createStudent(String rut, String name, short age, Sexo sexo, String address) {
        Student s = new Student(rut, name, age, sexo, address);
        studentList.add(s);
    }
    
    public void createAgreement(String name, float discount){
        Agreement a = new Agreement(name, discount);
        agreementList.add(a);
    }
    
    public void createEnrollment(Student student, Course course, boolean hAgreement){
        Enrollment e = new Enrollment(student, course, hAgreement);
        enrollmentList.add(e);
    }
}
