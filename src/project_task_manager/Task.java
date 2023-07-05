//package project_task_manager;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Task {
//    private String title;
//    private String description;
//    private String dueDate;
//    private int priority;
//    private String status;
//
//    public Task(String title, String description, String dueDate, int priority) {
//        this.title = title;
//        this.description = description;
//        this.dueDate = dueDate;
//        this.priority = priority;
//        this.status = "В процессе";
//    }
//
//    // Геттеры и сеттеры
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(String dueDate) {
//        this.dueDate = dueDate;
//    }
//
//    public int getPriority() {
//        return priority;
//    }
//
//    public void setPriority(int priority) {
//        this.priority = priority;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    @Override
//    public String toString() {
//        return "Задача: " + title +
//                "\nОписание: " + description +
//                "\nДата выполнения: " + dueDate +
//                "\nПриоритет: " + priority +
//                "\nСтатус: " + status;
//    }
//}
//class TaskManager {
//    private List<Task> tasks;
//
//    public TaskManager() {
//        tasks = new ArrayList<>();
//    }
//
//    public void addTask(Task task) {
//        tasks.add(task);
//    }
//
//    public void removeTask(Task task) {
//        tasks.remove(task);
//    }
//
//    public void viewAllTasks() {
//        for (Task task : tasks) {
//            System.out.println(task);
//            System.out.println("----------------------");
//        }
//    }
//
//    public List<Object> getTasks() {
//        return null;
//    }
//
//    // Другие методы для редактирования, сортировки, фильтрации и т.д.
//}
//
//public class ConsoleInterface {
//    private TaskManager taskManager;
//    private Scanner scanner;
//
//    public ConsoleInterface() {
//        taskManager = new TaskManager();
//        scanner = new Scanner(System.in);
//    }
//
//    public void run() {
//        boolean exit = false;
//        while (!exit) {
//            printMenu();
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Очистка буфера после считывания числа
//
//            switch (choice) {
//                case 1:
//                    createTask();
//                    break;
//                case 2:
//                    viewAllTasks();
//                    break;
//                case 3:
//                    editTask();
//                    break;
//                case 4:
//                    deleteTask();
//                    break;
//                case 5:
//                    markTaskAsComplete();
//                    break;
//                case 6:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Неверный ввод. Попробуйте снова.");
//            }
//        }
//    }
//
//    private void printMenu() {
//        System.out.println("Меню:");
//        System.out.println("1. Создать задачу");
//        System.out.println("2. Просмотреть все задачи");
//        System.out.println("3. Редактировать задачу");
//        System.out.println("4. Удалить задачу");
//        System.out.println("5. Отметить задачу как выполненную");
//        System.out.println("6. Выход");
//        System.out.print("Выберите действие: ");
//    }
//
//    private void createTask() {
//        System.out.print("Введите название задачи: ");
//        String title = scanner.nextLine();
//
//        System.out.print("Введите описание задачи: ");
//        String description = scanner.nextLine();
//
//        System.out.print("Введите дату выполнения задачи: ");
//        String dueDate = scanner.nextLine();
//
//        System.out.print("Введите приоритет задачи: ");
//        int priority = scanner.nextInt();
//        scanner.nextLine(); // Очистка буфера
//
//        Task task = new Task(title, description, dueDate, priority);
//        taskManager.addTask(task);
//
//        System.out.println("Задача успешно создана.");
//    }
//
//    private void viewAllTasks() {
//        System.out.println("Список всех задач:");
//        taskManager.viewAllTasks();
//    }
//
//    private void editTask() {
//        viewAllTasks();
//        System.out.print("Введите номер задачи, которую хотите отредактировать: ");
//        int taskIndex = scanner.nextInt();
//        scanner.nextLine(); // Очистка буфера
//
//        if (taskIndex >= 0 && taskIndex < taskManager.getTasks().size()) {
//            //Task task = taskManager.getTasks().get(taskIndex);
//            System.out.println("Текущая информация о задаче:");
//            //System.out.println(task);
//
//            System.out.print("Введите новое название задачи: ");
//            String newTitle = scanner.nextLine();
//            task.setTitle(newTitle);
//
//            // Аналогично для других полей задачи (описание, дата выполнения, приоритет и т.д.)
//
//            System.out.println("Задача успешно отредактирована.");
//        } else {
//            System.out.println("Неверный номер задачи.");
//        }
//    }
//
//    private void deleteTask() {
//        viewAllTasks();
//        System.out.print("Введите номер задачи, которую хотите удалить: ");
//        int taskIndex = scanner.nextInt();
//        scanner.nextLine(); // Очистка буфера
//
//        if (taskIndex >= 0 && taskIndex < taskManager.getTasks().size()) {
//            Task task = taskManager.getTasks().get(taskIndex);
//            taskManager.removeTask(task);
//            System.out.println("Задача успешно удалена.");
//        } else {
//            System.out.println("Неверный номер задачи.");
//        }
//    }
//
//    private void markTaskAsComplete() {
//        viewAllTasks();
//        System.out.print("Введите номер задачи, которую хотите отметить как выполненную: ");
//        int taskIndex = scanner.nextInt();
//        scanner.nextLine(); // Очистка буфера
//
//        if (taskIndex >= 0 && taskIndex < taskManager.getTasks().size()) {
//            Task task = taskManager.getTasks().get(taskIndex);
//            task.setStatus("Выполнено");
//            System.out.println("Задача успешно отмечена как выполненная.");
//        } else {
//            System.out.println("Неверный номер задачи.");
//        }
//    }
//
//    public static void main(String[] args) {
//        ConsoleInterface consoleInterface = new ConsoleInterface();
//        consoleInterface.run();
//    }
//}
