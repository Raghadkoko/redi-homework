package org.redi.inheritinace;

import java.util.Date;

/**
 * Created by User on 08.05.2017.
 */
public class Student extends Person {
    private String attendingCourse;
    public Student(){}

    public Student(String firstName, String lastName, Date dateOfBirth, String email, String attendingCourse) {
        super(firstName, lastName, dateOfBirth, email);
        this.attendingCourse = attendingCourse;
    }
    public String getTeachingKurse() {
        return studentAttendenCourse;
    }

    public void setSttudentAttendenCourse(String teachingKurse) {
        this.studentAttendenCourse = studentAttendenCourse;
    }

    private String studentAttendenCourse;
}
