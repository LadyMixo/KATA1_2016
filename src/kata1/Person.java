package Kata1;

import java.util.Date;

public class Person {

    private String color;
    private final String name = "Alejandro";
    private final Date birthdate = new Date(89, 11, 13);

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        return (int) ((new Date().getTime() - birthdate.getTime()) / 31536000000L);
    }
}