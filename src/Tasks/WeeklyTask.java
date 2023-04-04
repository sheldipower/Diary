package Tasks;

import java.time.LocalDateTime;

public class WeeklyTask extends Task {
    public WeeklyTask( String title, Type type, int id, LocalDateTime dateTime, String description) {
        super(title, type, id, dateTime, description);
    }
    @Override
    public boolean appearsln (LocalDateTime requestedDate){
        return getDateTime().getDayOfWeek().equals(requestedDate.getDayOfWeek());

    }
}
