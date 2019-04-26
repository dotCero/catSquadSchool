package model;

import model.enume.Sexo;

/**
 *
 * @author cero
 */
public class Student {

    private String rut;
    private String name;
    private short age;
    private Sexo sexo;
    private String address;

    public Student(String rut, String name, short age, Sexo sexo, String address) {
        this.rut = rut;
        this.name = name;
        this.age = age;
        this.sexo = sexo;
        this.address = address;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "rut=" + rut + ", name=" + name + ", age=" + age + ", sexo=" + sexo + ", address=" + address + '}';
    }

}
