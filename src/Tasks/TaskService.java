package Tasks;

import Exeptions.WrongInputExeption;
import Util.ValidateUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
    private static final Map<Integer, Task> actualTask = new HashMap<>();


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

    private static void createEvent(Scanner scanner, String title, String description, Type type, int appearsln) {
        try {
            LocalDateTime eventDate = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy HH:hh"));
            Task task;
            task = createTask(appearsln, title, description, type, eventDate);
            System.out.println("Задача создана" + task);

        } catch (DateTimeParseException e) {
            System.out.println("Проверьте формат даты");
            createEvent(scanner, title, description, type, appearsln);
        }
    }

    private static Task createTask(int appearsln, String title, String description, Type type, LocalDateTime localDateTime) throws WrongInputExeption {
        return switch (appearsln) {
            case 0 -> {
                OneTimeTask oneTimeTask = new OneTimeTask(title, description, type, localDateTime);
                actualTask.put(oneTimeTask.getId(), oneTimeTask);
                yield OneTimeTask;
            }
            case 1 -> {
                OneTimeTask oneTimeTask = new OneTimeTask(title, description, type, localDateTime);
                actualTask.put(oneTimeTask.getId(), oneTimeTask);
                yield OneTimeTask;
            }
            case 2 -> {
                OneTimeTask oneTimeTask = new OneTimeTask(title, description, type, localDateTime);
                actualTask.put(oneTimeTask.getId(), oneTimeTask);
                yield OneTimeTask;
            }
            case 3 -> {
                OneTimeTask oneTimeTask = new OneTimeTask(title, description, type, localDateTime);
                actualTask.put(oneTimeTask.getId(), oneTimeTask);
                yield OneTimeTask;
            }
            case 4 -> {
                OneTimeTask oneTimeTask = new OneTimeTask(title, description, type, localDateTime);
                actualTask.put(oneTimeTask.getId(), oneTimeTask);
                yield OneTimeTask;
            }
            default -> null;
        };
    }

    private static void printActualTask() {

    }


    public static void editTask(Scanner scanner) {
        try {
            System.out.println("Для того чтобы отредактировать задачу, напишите ее id: ");
            printActualTask();
            int id = scanner.nextInt();
            if (!actualTask.containsKey(id))
                System.out.println("Редактировать 0 - заголовок, 1- описание, 2 - тип, 3 - дата");
            int menuCase = scanner.nextInt();
            switch (menuCase) {
                case 0 -> {
                    scanner.nextLine();
                    System.out.println("Введите название задачи");
                    String title = actualTask.get(id);
                    task.setTitle(title);
                }
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Введите описание задачи");
                    String title = actualTask.get(id);
                    task.setDescription(description);
                }
                case 2 -> {
                    scanner.nextLine();
                    System.out.println("Введите тип задачи");
                    String title = actualTask.get(id);
                    task.setType(type);

                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.println("Введите дату выполнения задачи");
                    String title = actualTask.get(id);
                    task.setDate(date);
                }
            }

            public static void getTaskByDay(Scanner scanner){
                System.out.println("Введите дату: ");
                try {
                    String date = scanner.next();
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    LocalDateTime requestDate = LocalDateTime.parse(date, dateFormatter);
                    List<Task> foundEvent = findTaskByDate(requestDate);
                    System.out.println("События на: " + requestDate);
                    for (Task task : foundEvent) {
                        System.out.println(task);
                    }

                } catch (DateTimeParseException e) {
                    System.out.println("Неправильный формат ввода даты");

                }
                scanner.nextLine();

            }

            private static List<Task> findTaskByDate (LocalDateTime date){
                List<Task> tasks = new ArrayList<>();
                for (Task task : actualTask.values()) {
                    if (task.checkOccurance(date.atStartOFDay())) {
                        tasks.add(task);
                    }
                }
                return tasks;
            }


        } catch ()
    }

    public static void deleteTask(Scanner scanner) {
        actualTask.remove(actualTask.containsKey());
    }
}

