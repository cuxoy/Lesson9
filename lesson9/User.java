package lesson9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String country;
    private String email;
    private String password;
    private String sex;
   // private String text;

    public User() {
    }

    public User(String name, String surname, String country, String email, String password, String sex) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.email = email;
        this.password = password;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(country, user.country) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, country, email, password, sex);
    }


    void read (String text) {

        System.out.println(text);


    }

    public void wright() throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/resources/userSupportAdmin.txt");
        System.out.println("Please, Enter your name :");
        Scanner name = new Scanner(System.in);
        String userName = name.next();
        fileWriter.write(userName);
        System.out.println("Please enter your surname : ");
        Scanner surname = new Scanner(System.in);
        String userSurname = surname.next();
        fileWriter.write(userSurname);
        System.out.println("Please enter your country : ");
        Scanner country = new Scanner(System.in);
        String userCountry = surname.next();
        fileWriter.write(userCountry);
        System.out.println("Please enter your email : ");
        Scanner email = new Scanner(System.in);
        String userEmail = surname.next();
        fileWriter.write(userEmail);
        System.out.println("Please enter your password : ");
        Scanner password = new Scanner(System.in);
        String userPassword = surname.next();
        fileWriter.write(userPassword);
        System.out.println("Please enter your sex : ");
        Scanner sex = new Scanner(System.in);
        String userSex = surname.next();
        fileWriter.write(userSex);

        fileWriter.close();


    }
}

