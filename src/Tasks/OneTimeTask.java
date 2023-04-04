package Tasks;

import Exeptions.WrongInputExeption;

import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String type, String id, Type dateTime, LocalDateTime description) throws WrongInputExeption {
        super(title, type, id, dateTime, description);
    }
    @Override
    public boolean appearsln (LocalDateTime requestedDate){
        return getDateTime().toLocalDate().equals(requestedDate.toLocalDate());

    }
}
