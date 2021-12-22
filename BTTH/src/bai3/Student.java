package bai3;

public class Student {
    private int idStudent;
    private String name;
    private String birth;
    private String classStudent;

    public Student() {
    }

    public Student(int idStudent, String name, String birth, String classStudent) {
        this.idStudent = idStudent;
        this.name = name;
        this.birth = birth;
        this.classStudent = classStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }
}
