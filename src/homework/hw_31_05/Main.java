package homework.hw_31_05;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numOfElements = 100000; // Количество элементов для добавления

        // Создание и заполнение ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numOfElements; i++) {
            arrayList.add(i);
        }

        // Создание и заполнение LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numOfElements; i++) {
            linkedList.add(i);
        }

        // Измерение времени добавления элемента в середину ArrayList
        long arrayListStartTime = System.nanoTime();
        arrayList.add(numOfElements / 2, -1);
        long arrayListEndTime = System.nanoTime();
        long arrayListExecutionTime = arrayListEndTime - arrayListStartTime;

        // Измерение времени добавления элемента в середину LinkedList
        long linkedListStartTime = System.nanoTime();
        linkedList.add(numOfElements / 2, -1);
        long linkedListEndTime = System.nanoTime();
        long linkedListExecutionTime = linkedListEndTime - linkedListStartTime;

        // Вывод результатов
        System.out.println("Время выполнения операции добавления элемента в середину ArrayList: " + arrayListExecutionTime + " наносекунд");
        System.out.println("Время выполнения операции добавления элемента в середину LinkedList: " + linkedListExecutionTime + " наносекунд");

        // Вывод результата сравнения времени выполнения
        if (arrayListExecutionTime < linkedListExecutionTime) {
            System.out.println("ArrayList демонстрирует более быструю операцию добавления элемента в середину списка");
        } else if (arrayListExecutionTime > linkedListExecutionTime) {
            System.out.println("LinkedList демонстрирует более быструю операцию добавления элемента в середину списка");
        } else {
            System.out.println("Время выполнения операции добавления элемента в середину списка одинаково для ArrayList и LinkedList");
        }
    }
}

