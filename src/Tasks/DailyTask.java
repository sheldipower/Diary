package Tasks;

import Exeptions.WrongInputExeption;

import java.time.LocalDateTime;

public class DailyTask extends Task {
    public DailyTask(String title, Type type, Integer id, LocalDateTime dateTime, String description)throws WrongInputExeption {
        super(title, type, id, dateTime, description);
    }
    @Override
    public boolean appearsln (LocalDateTime requestedDate){
        return true;

    }
}
