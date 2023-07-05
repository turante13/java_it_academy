package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<String,User> users;
    private User user;
    public Main(){
        users = new HashMap<>();
        user = null;
    }
    private void createUser(String name, String email, String password ){
        User user = new User(name, email, password);
        users.put(email, user);
        System.out.println(" user успешно создан " );
    }
    private void loginUser(String email, String password){
        User user1 = users.get(email);
        if (user1 != null && user1.checkPassword(password)){
            user = user1;
            System.out.println("Вход выполнен!");
        }else{
            System.out.println("Неправильный пароль или Email!");
        }
    }
    public void logoutUser(){
        user = null;
        System.out.println("Выход из системы");
    }
    public void viewUser(){
        if (user != null){
            System.out.println("\n email" + (user.getEmail()));
            System.out.println("\n name" + (user.getName()));
        }else{
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==Menu==");
            System.out.println("Выберите действие");
            System.out.println("1. Создать пользователя");
            System.out.println("2. Вход в систему");
            System.out.println("3. Выход из системы");
            System.out.println("4. Вывести информацию о пользавателя");
            System.out.println("5. Изменить пароль");
            System.out.println("6. Выход из меню");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите имя пользователя");
                    String userName = scanner.nextLine();
                    System.out.println("Введите Email");
                    String userEmail = scanner.nextLine();
                    System.out.println("Введите пароль");
                    String userPassword = scanner.nextLine();
                    main.createUser(userName, userEmail, userPassword);
                    break;
            }
        }
    }
}

class User {
    private String name;
    private String email;
    private String password;

    User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }

    public void changePassword(String password){
        this.password = password;
        System.out.println("Пароль успешно изменен.");
    }


}




