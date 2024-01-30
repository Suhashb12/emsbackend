package Employee.Management.System.Model;

import javax.validation.constraints.NotNull;

public class EmployeeDTO
{
    private int id;
    private String name;
    private String gender;
    private int age;
    @NotNull
    private int contact;
    private String mail;
    private String password;

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

    public EmployeeDTO() {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.mail = mail;
        this.password = password;
    }
}
