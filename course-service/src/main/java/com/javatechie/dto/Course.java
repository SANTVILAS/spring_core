package com.javatechie.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Course {

    private int courseId;
    private String name;
    private String trainerName;
    private String duration;
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date startDate;
    private String courseType;//live or recorfing
    private double fees;
    private boolean isCertificateAvailable;
    private  String courseDescription;

    public Course() {
    }

    public Course(int courseId, String name, String trainerName, String duration, Date startDate, String courseType, double fees, boolean isCertificateAvailable, String courseDescription) {
        this.courseId = courseId;
        this.name = name;
        this.trainerName = trainerName;
        this.duration = duration;
        this.startDate = startDate;
        this.courseType = courseType;
        this.fees = fees;
        this.isCertificateAvailable = isCertificateAvailable;
        this.courseDescription = courseDescription;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean isCertificateAvailable() {
        return isCertificateAvailable;
    }

    public void setCertificateAvailable(boolean certificateAvailable) {
        isCertificateAvailable = certificateAvailable;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
