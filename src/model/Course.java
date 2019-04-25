package model;

/**
 *
 * @author cero
 */
public class Course {
    
    private String name;
    private double enrollment;
    private double tariff;
    private byte time;

    public Course(String name, double enrollment, double tariff, byte time) {
        this.name = name;
        this.enrollment = enrollment;
        this.tariff = tariff;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(double enrollment) {
        this.enrollment = enrollment;
    }

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

    public byte getTime() {
        return time;
    }

    public void setTime(byte time) {
        this.time = time;
    }
}