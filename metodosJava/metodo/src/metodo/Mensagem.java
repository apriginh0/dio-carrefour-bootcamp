package metodo;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {
    public static String date(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        return dtf.format(LocalDateTime.now())+" "+ ZonedDateTime.now().getZone();

    }
}
