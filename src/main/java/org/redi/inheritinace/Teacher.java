package org.redi.inheritinace;

/**
 * Created by User on 08.05.2017.
 */
public class Teacher extends Person{
    private String teachingKurse;

    public String getStudentAttendedKurse() {
        return teachingKurse;
    }

    public void setStudentAttendedKurse(String studentAttendedKurse) {
        this.teachingKurse = studentAttendedKurse;
    }
}
