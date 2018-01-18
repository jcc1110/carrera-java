package fechas;
// Viejo
import java.util.Calendar;

// Nuevos
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Fechas {
    public static void main(String[] args) {
        // Viejas versiones
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        
        // Nuevas clases: Fechas
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1991, 02, 07);
        System.out.println(ld + " " + ld2);
        System.out.println(ld.isAfter(ld2));
        System.out.println(ld.isBefore(ld2));
        
        // Tiempos
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.of(2, 40);
        System.out.println(lt + " " + lt2);
        System.out.println(lt.isAfter(lt2));
        System.out.println(lt.isBefore(lt2));
        
        // Fecha y hora
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(1991, Month.FEBRUARY, 7, 12, 30);
        System.out.println(ldt + " " + ldt2);
        System.out.println(ldt.isAfter(ldt2));
        System.out.println(ldt.isBefore(ldt2));
        
        // Periodos
        Period per = Period.between(ld2, ld);
        System.out.println("Hay:" + per.getYears());
    }
}
