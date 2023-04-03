package Tasks;

import Exeptions.WrongInputExeption;
import Util.ValidateUtils;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
    private  String title;
    private final Type type;
    private final LocalDateTime dateTime;
    private final   String description;
    private boolean archived;
    private static Integer counter = 1;
    private final Integer id;

    public Task( String title, Type type, Integer id, LocalDateTime dateTime, String description) throws WrongInputExeption {

        this.title = ValidateUtils.checkString (title);
        this.type = type;
        this.id = id;
        this.dateTime = dateTime;
        this.description = ValidateUtils.checkString (description);

        id = counter++;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }



     public abstract boolean appearsln (LocalDateTime localDateTime);
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && type == task.type && Objects.equals(dateTime, task.dateTime) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, id, dateTime, description);
    }

    @Override
    public String toString() {
        return "Task{"  +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }

}
