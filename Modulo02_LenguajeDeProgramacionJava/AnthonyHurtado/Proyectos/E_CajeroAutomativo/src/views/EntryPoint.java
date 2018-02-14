package views;
import java.util.Locale;

public class EntryPoint {
    public static void main(String[] args) {
        // Nuevo Locale de US
        Locale lc = new Locale("en", "us");
        Locale.setDefault(lc);
        
        // Construyo mi interfaz
        MyComponents mc = new MyComponents();
        mc.BuidWindows();
    }
}
