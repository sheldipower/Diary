package Tasks;

import java.time.LocalDateTime;

public class YearlyTask extends Task {
    public YearlyTask( String title, Type type, int id, LocalDateTime dateTime, String description) {
        super( title, type, id, dateTime, description);
    }
    @Override
    public boolean appearsln (LocalDateTime requestDate){
        return getDateTime().getDayOfYear() == (requestDate.getDayOfYear());
    }
}
