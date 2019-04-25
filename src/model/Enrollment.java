package model;

/**
 *
 * @author cero
 */
public class Enrollment {
    
    private Student student;
    private Course course;
    private boolean haveAgreement;
    private Agreement agreement;

    public Enrollment(Student student, Course course, boolean haveAgreement) {
        this.student = student;
        this.course = course;
        this.haveAgreement = haveAgreement;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean isHaveAgreement() {
        return haveAgreement;
    }

    public void setHaveAgreement(boolean haveAgreement) {
        this.haveAgreement = haveAgreement;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }
}