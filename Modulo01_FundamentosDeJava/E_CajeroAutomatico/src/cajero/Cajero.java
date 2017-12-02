package cajero;
import atm.*;
import excepciones.MiExATM;
import java.util.*;

/**
 * Punto principal para el cajero automatico.
 * @author Anthony Hurtado
 * @version 1.0
 */
public class Cajero {
    /**
     * @param args Argumentos iniciales.
     */
    public static void main(String[] args) {
        // Atributos de la clase
        int numeroCuenta;
        Integer clave;
        int opcion;
        int monto;
        
        // Instancias de Clase        
        Scanner scan = new Scanner(System.in);
        Cliente cliente;
        Banco banco = new Banco("Banco de Venezuela", "Chacao - Torre EXA");
        Operaciones op = new Operaciones();
        
        // Bienvenida del ATM
        System.out.println("Bienvenido/a al " + banco.getNombre() +" de "+ banco.getUbicacion());
        do {            
            System.out.print("Ingrese su número de cuenta: ");
            numeroCuenta = scan.nextInt();        
            System.out.print("Ingrese su clave: ");
            clave = scan.nextInt();

            // Si no encuentra al cliente envio un error
            cliente = banco.validarCliente(numeroCuenta, clave);
            if (Objects.isNull(cliente)) {
                System.out.println("Datos incorrectos, por favor intente de nuevo.");
            }
        } while(Objects.isNull(cliente));
        
        // Bienvenida al usuario
        System.out.println("================");
        System.out.println("Hola, "+ cliente.getNombreCompleto());
        System.out.println("Tipo de cuenta: "+ cliente.getTipoCuenta());
        System.out.println("Número de cuenta: "+ cliente.getNumeroCuenta());

        do {
            // Imprimo las opciones
            System.out.println("================");
            System.out.println("Operaciones:");
            System.out.println("1 - Consultar");
            System.out.println("2 - Retiro");
            System.out.println("3 - Deposito");
            System.out.println("4 - Cambio de Clave");
            System.out.println("5 - Salir");
            System.out.print("Opción: ");
            opcion = scan.nextInt();
            
            // Validar opcion seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: "+ op.consulta(cliente));
                    break;
                case 2:
                    try {
                        System.out.print("Indique el monto a retirar: ");
                        monto = scan.nextInt();                    
                        if (op.consulta(cliente) >= monto) {
                            cliente = op.retiro(cliente, monto);
                            System.out.println("Retiro realizado con éxito.");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } catch (MiExATM me) {
                        System.out.println("Error: "+ me);
                    }
                    break;
                case 3:
                    System.out.print("Indique el monto a depositar: ");
                    monto = scan.nextInt();
                    cliente = op.deposito(cliente, monto);
                    System.out.println("Depósito realizado con éxito.");
                    break;
                case 4:
                    try {
                        System.out.print("Indique su nueva clave: ");
                        clave = scan.nextInt();
                        cliente = op.cambiarClave(cliente, clave);
                        System.out.println("Cambio exitoso de la clave. Su nueva clave es: "+ cliente.getClave());
                    } catch(MiExATM me) {
                        System.out.println("Error: "+ me);
                    }
                    break;
            }
        } while(opcion != 5);
        
        // Despedida
        System.out.println("¡Gracias por realizar sus operaciones!");
    } 
}
