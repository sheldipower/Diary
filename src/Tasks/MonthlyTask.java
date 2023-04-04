package Tasks;

import Exeptions.WrongInputExeption;

import java.time.LocalDateTime;

public class MonthlyTask extends Task{
    public MonthlyTask(String title, Type type, int id, LocalDateTime dateTime, String description) throws WrongInputExeption {
        super(title, type, id, dateTime, description);
    }
    @Override
    public boolean appearsln (LocalDateTime requestDate){
        return getDateTime().getDayOfMonth() == (requestDate.getDayOfMonth());

    }
}
