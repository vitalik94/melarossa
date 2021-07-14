package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dean {

    public List<Student> averageMark(List<Student> student) {//

        List<Student> s = student;

        List<Student> result = new ArrayList<Student>();

        for (int i = 0; i < s.size(); i++) {

            int sum = 0;
            int[] mas = s.get(i).getSubjectGrades();
            int k = mas.length;

            for (int j = 0; j < mas.length; j++) {
                sum = sum + mas[j];
                k = j;
            }

            if (sum / k >= 3) {
                s.get(i).setCourse(s.get(i).getCourse() + 1);
                result.add(s.get(i));
            }

        }
        return result;
    }

    public void printStudents(List<Student> st) {

        for (Student s : st) {
            System.out.println("имя " + s.getName() + ", курс " + s.getCourse());
        }

    }

    public void chooseCourse(List<Student> st, int numCourse){

        for(Student s:st){
            if(s.getCourse() == numCourse){
                System.out.println(s);
            }
        }

    }

}
