import java.time.*;
import java.time.format.DateTimeFormatter;

public class Displaylocaldate {
    public static void main(String[] args)
    {
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        LocalDateTime mytimedate = LocalDateTime.now();
        DateTimeFormatter dattimefo = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formateddate = mytimedate.format(dattimefo);
        
        System.out.println(mytime);
        System.out.println(mydate);
        System.out.println(mytimedate);
        System.out.println(formateddate);
    }
    
}
