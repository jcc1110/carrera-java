package swing_practicas;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Swing_Practicas {
    public static void main(String[] args) {
        // Llamando a mi ventana
        MisVentanas mv = new MisVentanas();
        
        // Contenedor de componentes
        Container cp = mv.getContentPane();
        
        // Layout a utilizar
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
        GridLayout gl = new GridLayout(2, 3);
        BorderLayout bl = new BorderLayout();
        cp.setLayout(fl);
        
        // Componentes a nueva ventana
        JLabel etiqueta1 = new JLabel("Nombre:");
        JLabel etiqueta2 = new JLabel("---");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        // Implementación de la interfaz requerida
        ActionListener al = (e) -> {
            String mensaje;
            String valor = texto.getText();
            
            if (!valor.isEmpty()) {
                mensaje = "Hola " + valor;
            } else {
                mensaje = "Hola mundo";
            }
            
            JOptionPane.showMessageDialog(boton, mensaje);
        };
        boton.addActionListener(al);
        
        // Añado mis componentes a la ventana
        cp.add(etiqueta1, BorderLayout.NORTH);
        cp.add(texto, BorderLayout.SOUTH);
        cp.add(boton, BorderLayout.EAST);
        cp.add(etiqueta2, BorderLayout.WEST);
    }
}
