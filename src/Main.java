import Tasks.TaskService;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
           Label:
           while (true) {
               System.out.println("Выберете пункт мееню: ");
               printMenu();
               if (scanner.hasNextInt()) {
                   int menu = scanner.nextInt();
                   switch (menu) {
                       case 1:
                           TaskService.addTask(scanner);
                           break;
                       case 2:
                           TaskService.editTask(scanner);
                           break;
                       case 3:
                           TaskService.deleteTask(scanner);
                           break;
                       case 4:
                           TaskService.getTaskByDay(scanner);
                           break;
                       case 0:
                           break Label;
                   }
               } else {
                   scanner.next();
                   System.out.println("Выберете пункт меню из списка: ");
               }
           }
       }


    }

    private static void printMenu() {
        System.out.println(""+
                "1.Добавить задачу" +
                "2. Редактировать задачу" +
                "3. Удалить задачу" +
                "4. Получить задачи на день");
    }
}