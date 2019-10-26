package lv.javaguru.lesson4.HomeWork3;

import java.util.Scanner;

public class User {
    private String name;
    private String password;
    public String inputedName;
    public String inputedPassword;
    private int loginAttemptsLeft = 3;
    private boolean blocked = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void login() {

        if (blocked == false) {
            Scanner inputUsernamePassword = new Scanner(System.in);
            System.out.println("Write your username: ");
            this.inputedName = inputUsernamePassword.nextLine();
            System.out.println("Write your Password: ");
            this.inputedPassword = inputUsernamePassword.nextLine();
            if (name.equals(inputedName) && password.equals(inputedPassword)) {
                System.out.println("Your password is correct");
            } else {
                loginAttemptsLeft--;
                if (loginAttemptsLeft > 0) {
                    System.out.println("Your password is incorrect, you have " + loginAttemptsLeft + " login attempts left ");
                    login();
                } else {
                    System.out.println("You are blocked, try again in 10 minutes");
                    blocked = true;
                }
            }


        }

    }
}
