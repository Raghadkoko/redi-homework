package org.redi.inheritinace;

import java.util.Date;

/**
 * Created by User on 08.05.2017.
 */
public class Person {
    // variables
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;

   //---------------------------------------------------------------------------

    //constructor 1 --> Bsp. private Person person1 = new Person();
    public Person(){}

    // constructor 2 --> private Person person2 = new Person(Raghad, Koko, 22.02.1996, RaghadKoko@gmail.com );
    public Person(String firstName, String lastName, Date dateOfBirth, String email){
        this.firstName =firstName;
        this.lastName = lastName;
        this.dateOfBirth =dateOfBirth;
        this.email =email;
    }

    //---------------------------------------------------------------------------

    // getter & setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String Name) {
        this.firstName = Name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
