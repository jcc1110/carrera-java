package com.structure;
import com.operation.AgeStructure;
import java.time.LocalDate;
import java.time.Period;

public class AgeOperation implements AgeStructure {
    // Atributos necesarios
    private int year;
    private int month;
    private int day;

    @Override
    public String ageCalculate() {
        // Variable para el mensaje
        String message;
        
        // Obteniendo la fecha actual
        LocalDate currentDate = LocalDate.now();
        
        // Creando un objeto LocalDate con la fecha del usuario
        LocalDate userBirthDate = LocalDate.of(this.getYear(), this.getMonth(), this.getDay());
        
        // Creando el objeto para obtener los datos entre fechas
        Period period = Period.between(userBirthDate, currentDate);
        
        // Creando la respuesta formateada
        message = "Ha transcurrido " + period.getYears() + " años, ";
        message += period.getMonths() + " meses y ";
        message += period.getDays() + " días.";
        
        // Devolviendo el mensaje formateado
        return message;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
