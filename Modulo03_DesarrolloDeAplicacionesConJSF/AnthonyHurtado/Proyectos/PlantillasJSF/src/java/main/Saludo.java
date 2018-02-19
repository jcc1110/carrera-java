package main;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "saludo")
@ApplicationScoped
public class Saludo {
    private String name;
    private int year;
    
    public Saludo() {
        this.setName("Anthony");
        this.setYear(1991);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
