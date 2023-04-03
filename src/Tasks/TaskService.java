package Tasks;

import Exeptions.WrongInputExeption;
import Util.ValidateUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskService {
 private static final Map<Integer, Task> task = new HashMap<>();

    public static void addTask(Scanner scanner) {
        try {
            scanner.nextLine();
            System.out.println("Введите название задачи");
            String title = ValidateUtils.checkString(scanner.nextLine());
            System.out.println("Введите описание задачи");
            String description = ValidateUtils.checkString(scanner.nextLine());
            System.out.println("Введите тип задачи: Рабочая - WORK или Личная - PERSONAL");
            Type type = Type.values()[scanner.nextInt()];
            System.out.println("Как часто должна повторяться задача?: " +
                    "0 - один раз" +
                    "1 - каждый день" +
                    "2 - каждую неделю" +
                    "3 - каждый месяц" +
                    "4 - каждый год");
            int appearsln = scanner.nextInt();
            System.out.println("Введите дату:");
            scanner.nextLine();
        } catch (WrongInputExeption e) {
            System.out.println(e.getMessage());
        }
    }
    private static void createEvent (Scanner scanner, String title, String description, Type type,int appearsln ) {
        try {
            LocalDateTime eventDate = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy HH:hh"));
            Task task;
                task = createTask (appearsln, title, description, type, eventDate);
                System.out.println("Задача создана" + task);

        } catch (DateTimeParseException e) {
            System.out.println("Проверьте формат даты");
            createEvent(scanner, title, description, type, appearsln);
        }
    }



    public static void editTask (Scanner scanner) {
        try {

        }
    }



}
