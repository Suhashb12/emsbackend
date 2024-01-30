package Employee.Management.System.entities;

import jakarta.persistence.*;

@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String Name;
    private String gender;
    private int age;
    private int contact;
    @Column(length = 50)
    private String mail;
    @Column(unique = true)
    private String password;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee() {
        super();
    }

    public Employee(int id, String name, String gender, int age, int contact, String mail, String password) {
        super();
        this.id = id;
        Name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.mail = mail;
        this.password = password;
    }
}
