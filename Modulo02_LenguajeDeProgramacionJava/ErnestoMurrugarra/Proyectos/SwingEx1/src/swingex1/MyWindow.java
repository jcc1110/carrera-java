/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingex1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author instructor
 */
public class MyWindow {
    // Atributos
    // Mi ventana
    JFrame jf;
    // Mis componentes atómicos
    JButton JbButton;
    JLabel JlLabel;
    JTextField JtfField;
    JCheckBox JckBox;
    JRadioButton JrbRadio;
    
    // Métodos
    public MyWindow(String n) {
        // Título de la ventana
        this.jf = new JFrame(n);// Creamos el objeto de la ventana.
        this.jf.setSize(800, 200);// Asignar tamaño.
        this.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Asignamos la acción de cierre
        this.jf.setResizable(true);// Para que no cambie de tamaño.
        this.jf.setLocationRelativeTo(null);
        
        // Agregamos el contenedor a nuestra ventana
        Container cp = this.jf.getContentPane();
        
        // Definir el canvas o Layout
        // Manejador de componentes FlowLayout
        /*FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(50);*/
        
        // Manejador de componentes GridLayout
        //GridLayout gl = new GridLayout(3,3);
        
        // Manejador de componentes BorderLayout
        BorderLayout bl = new BorderLayout();
        
        // El layout es el encargado de agregar los componentes atómicos
        // al contenedor de nuestra ventana.
        cp.setLayout(bl);
        
        // Inicializar componentes
        this.initComponents();
        
        // Agregamos componentes atómicos
        /*cp.add(this.JbButton);
        cp.add(this.JlLabel);
        cp.add(this.JtfField);
        cp.add(this.JckBox );
        cp.add(this.JrbRadio);*/
        cp.add(this.JbButton, BorderLayout.EAST);
        cp.add(new JButton("Botón 1"), BorderLayout.SOUTH);
    }
    
    // La inicialización de los componentes es la definición del valor de sus
    // atributos
    public void initComponents() {
        this.JbButton = new JButton("Botón");
        this.JlLabel = new JLabel("Etiqueta: ");
        this.JtfField = new JTextField(10);
        this.JckBox = new JCheckBox("Opción extra");
        this.JrbRadio = new JRadioButton("Solo una de las opciones");
    }
    
    public void showMe() { this.jf.setVisible(true); }
}














