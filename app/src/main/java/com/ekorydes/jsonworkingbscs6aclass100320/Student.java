package com.ekorydes.jsonworkingbscs6aclass100320;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("name")
    private String nameOfStudent;

    @SerializedName("roll")
    @Expose (serialize = false)
    private int rollOfStudent;

    public Student(String nameOfStudent, int rollOfStudent) {
        this.nameOfStudent = nameOfStudent;
        this.rollOfStudent = rollOfStudent;
    }

    //    @SerializedName("subject")
//    private List<SubjectInfo> objectSubjectInfo;
//
//    public Student(String nameOfStudent, int rollOfStudent, List<SubjectInfo> objectSubjectInfo) {
//        this.nameOfStudent = nameOfStudent;
//        this.rollOfStudent = rollOfStudent;
//        this.objectSubjectInfo = objectSubjectInfo;
//    }
}
