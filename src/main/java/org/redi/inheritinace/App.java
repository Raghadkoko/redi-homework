package org.redi.inheritinace;

/**
 * Created by User on 08.05.2017.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Inertance");
        Student reem = new Student();
        reem.setFirstName("Reem");
        reem.setLastName("Koko");
        System.out.println("Name"+reem.getFirstName()+" "+reem.getLastName());
        Teacher Mohamed=new Teacher();
        Mohamed.setFirstName("Mohamed");
        Mohamed.setLastName("koko");
        System.out.println("Teacher Name :"+ Mohamed.getFirstName()+"  "+Mohamed.getLastName());

    }

}