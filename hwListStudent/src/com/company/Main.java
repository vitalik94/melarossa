package com.company;

/*
Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student.
Создать класс Dean(Декан) имеющий методы:
- который удаляет студентов со средним баллом <3. Если средний балл>=3, студент переводится на следующий курс.
- printStudents(List<Student> students, int course), который получает список студентов и номер курса.
- печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Student> student = new ArrayList<Student>();

        student.add(new Student("Иванов", 12,1,new int[]{3,4,3,5,4}));
        student.add(new Student("Романов", 15,2,new int[]{2,2,3,1,3}));
        student.add(new Student("Котов", 15,2,new int[]{5,4,3,4,4}));
        student.add(new Student("Королев", 12,1,new int[]{2,2,3,2,2}));
        student.add(new Student("Павлов", 12,1,new int[]{3,3,3,3,3}));

        Dean d = new Dean();
        List<Student> st = d.averageMark(student);

        for(Student s:st){
            System.out.println(s);
        }

        int numCourse = 2;

        d.printStudents(st);
        d.chooseCourse(st , numCourse);

    }

}
