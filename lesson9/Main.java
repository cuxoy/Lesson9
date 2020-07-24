package lesson9;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setName("1");
        user.setSurname("2");
        user.setCountry("3");
        user.setEmail("4");
        user.setPassword("5");
        user.setSex("6");
        user.read(user.getName() + user.getSurname() + user.getCountry() + user.getEmail() + user.getPassword() +
                user.getSex());
        user.wright();

        Support support = new Support();
        support.setName("1");
        support.setSurname("2");
        support.setCountry("3");
        support.setEmail("4");
        support.setPassword("5");
        support.setSex("6");

        System.out.println(support.reader(support.getName() + support.getSurname() + support.getCountry()
                + support.getEmail() + support.getPassword() + support.getSex()));

        Admin admin = new Admin();
        admin.setName("1");
        admin.setSurname("2");
        admin.setCountry("3");
        admin.setEmail("4");
        admin.setPassword("5");
        admin.setSex("6");

        System.out.println(admin.reader(admin.getName() + admin.getSurname() + admin.getCountry()
                + admin.getEmail() + admin.getPassword() + admin.getSex()));
        if (!support.reader(admin.getName() + admin.getSurname() + admin.getCountry()
                + admin.getEmail() + admin.getPassword() + admin.getSex())) {
            System.out.println("Тут должен быть метод с удалением");
            ;
        }//Пятое и шестое задание так и не разобрался как релизовать(((

    }


}
