package web.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @Pattern(regexp = "[A-Za-z]{2,12}", message = "Name should be between 2 and 12 latin characters")
    private String name;

    @Column(name = "surname")
    @Pattern(regexp = "[A-Za-z]{2,15}", message = "Surname should be between 2 and 15 latin characters")
    private String surName;

    @Column(name = "age")
    @Min(value = 1, message = "Age should be > 0")
    @Max(value = 127, message = "Age should be < 128")
    private byte age;
    @Column(name = "email")
    @Email
    private String email;

    public User() {

    }

    public User(int id, String name, String surName, byte age, String email) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
