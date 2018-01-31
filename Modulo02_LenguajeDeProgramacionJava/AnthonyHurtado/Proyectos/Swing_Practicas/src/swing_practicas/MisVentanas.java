package swing_practicas;
import javax.swing.JFrame;

public class MisVentanas extends JFrame {
    public MisVentanas() {
        super("Mi primera ventana");
        super.setSize(400, 400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
