package bai3;

import java.text.SimpleDateFormat;

public class Library {
    private String numberOfNote;
    private String beginDate;
    private String expireDate;
    private Student student;

    public Library() {
    }

    public Library(String numberOfNote, String beginDate, String expireDate, Student student) {
        this.numberOfNote = numberOfNote;
        this.beginDate = beginDate;
        this.expireDate = expireDate;
        this.student = student;
    }

    public String getNumberOfNote() {
        return numberOfNote;
    }

    public void setNumberOfNote(String numberOfNote) {
        this.numberOfNote = numberOfNote;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
