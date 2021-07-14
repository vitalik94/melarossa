package com.company;

import java.util.Arrays;

public class Student {

    private String name;
    private int group;
    private int course;
    private int[] subjectGrades;

    public Student(String name, int group, int course, int[] subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setSubjectGrades(int[] subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public int[] getSubjectGrades() {
        return subjectGrades;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", group=" + group + ", course=" + course + ", subjectGrades=" + Arrays.toString(subjectGrades) + '}';
    }

}
