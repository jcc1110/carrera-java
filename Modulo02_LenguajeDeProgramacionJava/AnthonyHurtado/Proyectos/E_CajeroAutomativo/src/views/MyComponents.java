package views;
import controllers.ProcessController;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.User;
import java.util.ResourceBundle;

public class MyComponents {
    // Atributos
    ProcessController pc;
    User currentUser;
    
    // ZeroComponents
    JLabel lbWelcome = new JLabel();
    
    // FirstComponents
    JLabel lbCard = new JLabel(ResourceBundle.getBundle("i18n/Bundle").getString("TARJETA:"));
    JTextField txtCard = new JTextField(10);
    JLabel lbPass = new JLabel(ResourceBundle.getBundle("i18n/Bundle").getString("CLAVE:"));
    JPasswordField txtPass = new JPasswordField(10);
    JButton btnValidate = new JButton(ResourceBundle.getBundle("i18n/Bundle").getString("VALIDAR"));
    JButton btnClear = new JButton(ResourceBundle.getBundle("i18n/Bundle").getString("LIMPIAR"));
    
    // SecondComponents     
    JButton btnBalance = new JButton(ResourceBundle.getBundle("i18n/Bundle").getString("CONSULTAR SALDO"));
    JButton btnDeposit = new JButton(ResourceBundle.getBundle("i18n/Bundle").getString("DEPÓSITO"));
    JButton btnRetirement = new JButton(ResourceBundle.getBundle("i18n/Bundle").getString("RETIRO"));
    JButton btnChangePass = new JButton(ResourceBundle.getBundle("i18n/Bundle").getString("CAMBIAR CLAVE"));
    JButton btnLogOut = new JButton(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("CERRAR SESIÓN"));
    
    // ThirdComponents     
    JLabel lbValue = new JLabel(java.util.ResourceBundle.getBundle("i18n/Bundle").getString("VALOR:"));
    JTextField txtValue = new JTextField(10);
    
    // Métodos
    public MyComponents() {
        this.pc = new ProcessController();
        this.currentUser = new User();
        this.currentUser = null;
    }
    
    public void BuidWindows() {
        // Creo la ventana
        JFrame jf = new JFrame();
        jf.setSize(600, 165);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle(ResourceBundle.getBundle("i18n/Bundle").getString("CAJERO AUTOMÁTICO"));
        jf.setResizable(false);
        
        // Creo el contenedor
        Container cp = jf.getContentPane();
        cp.setLayout(new GridLayout(4, 1));
        
        // Añado los elementos
        cp.add(this.ZeroComponents());
        cp.add(this.FirstComponents());
        cp.add(this.SecondComponents());
        cp.add(this.ThirdComponents());
        
        // Establezco la visibiidad de la ventana
        jf.setVisible(true);
    }
    
    public JPanel ZeroComponents() {    
        // Obtener la fecha actual
        lbWelcome.setText(ResourceBundle.getBundle("i18n/Bundle").getString("BIENVENIDO, HOY ES") +" "+ LocalDate.now());
        
        // Panel
        JPanel jp0 = new JPanel();
        jp0.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp0.add(lbWelcome);
        
        // Retorna el JPanel
        return jp0;
    }
    
    public JPanel FirstComponents() {        
        // Eventos
        ActionListener al = (e) -> {
            // Validando el tipo de evento
            if (e.getActionCommand().equals(ResourceBundle.getBundle("i18n/Bundle").getString("VALIDAR"))) {
                // Variables necesarias
                User user;
                String card;
                String password;
                String title;

                // Obteniendo los valores
                card = txtCard.getText();
                password = txtPass.getText();

                // Flujo
                if (!card.isEmpty() || !password.isEmpty()) {                    
                    user = this.pc.validate(card, password);                  
                    if (user != null) {
                        this.currentUser = user;
                        
                        title = lbWelcome.getText() + " ";
                        title += ResourceBundle.getBundle("i18n/Bundle").getString("CLIENTE #") + this.currentUser.getTarjeta();
                        lbWelcome.setText(title);
                        
                        JOptionPane.showMessageDialog(btnValidate, ResourceBundle.getBundle("i18n/Bundle").getString("¡BIENVENIDO A NUESTRO CAJERO AUTOMÁTICO!"));
                    } else {
                        JOptionPane.showMessageDialog(btnValidate, ResourceBundle.getBundle("i18n/Bundle").getString("TARJETA O CLAVE INVALIDOS."));
                    }
                } else {
                    JOptionPane.showMessageDialog(btnValidate, ResourceBundle.getBundle("i18n/Bundle").getString("LOS CAMPOS TARJETA Y CLAVE SON REQUERIDOS."));
                }           
            } else {
                txtCard.setText("");
                txtPass.setText("");
            }
        };
        btnValidate.addActionListener(al);
        btnClear.addActionListener(al);
        
        // Panel
        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp1.add(lbCard);
        jp1.add(txtCard);
        jp1.add(lbPass);
        jp1.add(txtPass);
        jp1.add(btnValidate);
        jp1.add(btnClear);
        
        // Retorna el JPanel
        return jp1;
    }
    
    public JPanel SecondComponents() {        
        // Eventos
        ActionListener eventBalance = (e) -> {
            if (!Objects.isNull(this.currentUser)) {
                // Variables necesarias
                String balanceMessage;

                // Consulta
                this.currentUser.setSaldo(this.pc.balance(this.currentUser.getId()));
                balanceMessage = ResourceBundle.getBundle("i18n/Bundle").getString("SU SALDO ACTUAL ES: ") +" "+ this.currentUser.getSaldo();

                // Resultado
                JOptionPane.showMessageDialog(btnBalance, balanceMessage);
            } else {
                JOptionPane.showMessageDialog(btnBalance, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE AUTENTICARSE PRIMERO"));
            }
        };
        
        ActionListener eventDeposit = (e) -> {
            if (!Objects.isNull(this.currentUser)) {
                if (txtValue.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnDeposit, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE INDICAR UN VALOR A DEPOSITAR"));
                } else {
                    if (this.pc.depositRetirement(this.currentUser.getId(), "I", Double.parseDouble(txtValue.getText()))) {
                        JOptionPane.showMessageDialog(btnDeposit, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEPÓSITO REALIZADO CON ÉXITO"));
                    } else {
                        JOptionPane.showMessageDialog(btnDeposit, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("OCURRIO UN ERROR DURANTE EL DEPÓSITO"));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(btnDeposit, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE AUTENTICARSE PRIMERO"));
            }
        };
        
        ActionListener eventRetirement = (e) -> {
            if (!Objects.isNull(this.currentUser)) {
                if (txtValue.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnRetirement, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE INDICAR UN VALOR A RETIRAR"));
                } else {
                    if (this.pc.depositRetirement(this.currentUser.getId(), "E", Double.parseDouble(txtValue.getText()))) {
                        JOptionPane.showMessageDialog(btnRetirement, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("RETIRO REALIZADO CON ÉXITO"));
                    } else {
                        JOptionPane.showMessageDialog(btnRetirement, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("OCURRIO UN ERROR DURANTE EL RETIRO"));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(btnRetirement, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE AUTENTICARSE PRIMERO"));
            }
        };
        
        ActionListener eventChangePass = (e) -> {
            if (!Objects.isNull(this.currentUser)) {
                if (txtValue.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnChangePass, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE INDICAR LA NUEVA CLAVE"));
                } else {
                    if (this.pc.changePassword(this.currentUser.getId(), txtValue.getText())) {
                        JOptionPane.showMessageDialog(btnChangePass, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("CAMBIO DE CLAVE EXITOSO"));
                    } else {
                        JOptionPane.showMessageDialog(btnChangePass, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("OCURRIO UN ERROR AL INTENTAR CAMBIAR LA CLAVE"));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(btnChangePass, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE AUTENTICARSE PRIMERO"));
            }
        };
        
        ActionListener eventLogOut = (e) -> {
            if (!Objects.isNull(this.currentUser)) {
                this.currentUser = null;
                txtCard.setText("");
                txtPass.setText("");
                txtValue.setText("");
                lbWelcome.setText(ResourceBundle.getBundle("i18n/Bundle").getString("BIENVENIDO, HOY ES") +" "+ LocalDate.now());
            } else {
                JOptionPane.showMessageDialog(btnChangePass, java.util.ResourceBundle.getBundle("i18n/Bundle").getString("DEBE AUTENTICARSE PRIMERO"));
            }
        };
        
        // Asociando el evento click
        btnBalance.addActionListener(eventBalance);
        btnDeposit.addActionListener(eventDeposit);
        btnRetirement.addActionListener(eventRetirement);
        btnChangePass.addActionListener(eventChangePass);
        btnLogOut.addActionListener(eventLogOut);
        
        // Panel
        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp2.add(btnBalance);
        jp2.add(btnDeposit);
        jp2.add(btnRetirement);
        jp2.add(btnChangePass);
        jp2.add(btnLogOut);
        
        // Retorna el JPanel
        return jp2;
    }
    
    public JPanel ThirdComponents() {        
        // Panel
        JPanel jp3 = new JPanel();
        jp3.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp3.add(lbValue);
        jp3.add(txtValue);
        
        // Retorna el JPanel
        return jp3;
    }
}
